import java.util.Scanner;

class QuickStart {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GetUserInput(scanner);
    }

    private static void GetUserInput(Scanner scanner) {
        while (true) {
            System.out.println("\nKundenverwaltung");
            System.out.println("1. Kunden hinzufügen");
            System.out.println("2. Kunden anzeigen");
            System.out.println("3. Kunden aktualisieren");
            System.out.println("4. Kunden löschen");
            System.out.println("5. Beenden");

            System.out.print("Wählen Sie eine Option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    DB_Manager.AddCustomer(scanner);
                    break;

                case 2:
                    DB_Manager.DisplayCustomers();
                    break;

                case 3:
                    DB_Manager.ChangeCustomer(scanner);
                    break;

                case 4:
                    DB_Manager.DeleteCostumer(scanner);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("invalid Number!");
                    break;
            }
        }
    }
}