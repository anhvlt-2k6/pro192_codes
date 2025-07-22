package DomainManagement;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class DynamicArraySorting {
    
    // Input and Output
    File inputFile;
    FileWriter outputFile;
    
    // Input as args and Output as result string
    ArrayList<String> args;
    String result = "";
    
    public void writeOutput() {
        try {
            outputFile = new FileWriter("output.txt");
            outputFile.write(result);
            outputFile.close();
        } catch (Exception e) {
            System.err.println("#ERROR: " + e.getCause());
        }
    }
    
    public void readInput() {
        try {
            inputFile = new File("input.txt");
            Scanner nl = new Scanner(inputFile);
            args = new ArrayList<>();
            while (nl.hasNextLine()) {
                args.add(nl.nextLine());
            }
        } catch (Exception e) {
            System.err.println("#ERROR: " + e.getCause());
        }
    }
    
    public String displayArgHelp(int i) {
        return "Line " + i + " has an invalid comamnd\n"
             + "* Valid args include:\n"
             + "  * ADD {id} {domainType} {domain} {expirationDate} {whoisInformation}\n"
             + "  * CHANGE { EXPDATE | WHOIS } {id} {VALUE}\n"
             + "  * REMOVE {ALL | {id}}\n"
             + "  * SORT\n"
             + "  * SHOW {ALL | {id}}";
    }
    
    public void solve() {
        ArrayList<DomainName> dnList = new ArrayList<>();
       for (int i = 0; i < args.size(); i++) {
           if (args.get(i).startsWith("#")) {
               continue; // skip if the # as comment appear
           }
           String[] arg = args.get(i).split(" ");
           
           /*
           * The arg include
           * ADD {id} {domainType} {domain} {expirationDate} {whoisInformation}
           * CHANGE { EXPDATE | WHOIS } {id} {VALUE}
           * REMOVE {ALL | {id}}
           * SORT
           * SHOW {ALL | {id}}
           */
           
           if (arg[0].equals("ADD")) {
               try {
                    int id = Integer.parseInt(arg[1]);
                    String domainType = arg[2];
                    String domain = arg[3];
                    int expirationDate = Integer.parseInt(arg[4]);
                    String whoisInformation = arg[5];
                    dnList.add(new DomainName(id, domainType, domain, expirationDate, whoisInformation));
                    result += "Added domain: " + domain + "\n";
               } catch (NullPointerException e) {
                   System.err.println("ERROR: " + e.getLocalizedMessage());
                   result = displayArgHelp(i + 1);
                   break;
               } catch (Exception e) {
                   System.err.println("ERROR: " + e.getLocalizedMessage());
                   result = displayArgHelp(i + 1);
                   break;
               }
           } else if (arg[0].equals("CHANGE")) {
               try {
                for (DomainName dn : dnList) {
                    if (dn.getId() == Integer.parseInt(arg[2])) {
                        if (arg[1].equals("EXPDATE")) {
                            dn.setExpirationDate(Integer.parseInt(arg[3]));
                            result += "Domain " + dn.getDomain() + " expiration delayed to: " + dn.getExpirationDate() + "\n";
                        } else if (arg[1].equals("WHOIS")) {
                            dn.setWhoisInformation(arg[3]);
                            result += "WHOIS updated for the domain: " + dn.getDomain() + " \n";
                        }
                    }
                }
               } catch (NullPointerException e) {
                   System.err.println("ERROR: " + e.getLocalizedMessage());
                   result = displayArgHelp(i + 1);
                   break;
               } catch (Exception e) {
                   System.err.println("ERROR: " + e.getLocalizedMessage());
                   result = displayArgHelp(i + 1);
                   break;
               }
           } else if (arg[0].equals("REMOVE")) {
               try {
                   if (arg[1].equals("ALL")) {
                       dnList.removeAll(dnList);
                       result += "* REMOVED ALL DOMAINS!\n";
                   } else {
                       for (DomainName dn : dnList) {
                           if (dn.getId() == Integer.parseInt(arg[1])) {
                               dnList.remove(dn);
                               result += "* REMOVED DOMAIN with Id: " + arg[1] + "\n";
                               break;
                           }
                       }
                   }
               } catch (NullPointerException e) {
                   System.err.println("ERROR: " + e.getLocalizedMessage());
                   result = displayArgHelp(i + 1);
                   break;
               } catch (Exception e) {
                   System.err.println("ERROR: " + e.getLocalizedMessage());
                   result = displayArgHelp(i + 1);
                   break;
               }
           } else if (arg[0].equals("SORT")) {
               try {
                   Collections.sort(dnList, new DomainName());
                   result += "* Domain list is sorted by the Expiration Date\n";
               } catch (Exception e) {
                   System.err.println("ERROR: " + e.getLocalizedMessage());
                   break;
               }
           } else if (arg[0].equals("SHOW")) {
               try {
                   if (arg[1].equals("ALL")) {
                       result += "===SHOW ALL DOMAIN===\n";
                       for (DomainName dn : dnList) {
                           result += dn.getDomainInformation() + "\n";
                       }
                   } else {
                       result += "===SHOW SELECTED DOMAIN: " + arg[1] + "===\n";
                       for (DomainName dn : dnList) {
                           if (dn.getId() == Integer.parseInt(arg[1])) {
                               result += dn.getDomainInformation() + "\n";
                               break;
                           }
                       }
                   }
               } catch (NullPointerException e) {
                   System.err.println("ERROR: " + e.getLocalizedMessage());
                   result = displayArgHelp(i + 1);
                   break;
               } catch (Exception e) {
                   System.err.println("ERROR: " + e.getLocalizedMessage());
                   result = displayArgHelp(i + 1);
                   break;
               }
           } else {
               result = displayArgHelp(i + 1);
               break;
           }
       } 
    }
    
    public static void main(String[] args) {
        DynamicArraySorting o = new DynamicArraySorting();
        o.readInput();
        o.solve();
        o.writeOutput();
    }
}
