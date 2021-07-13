public class Array {


    public static void main(String[] args){
        System.out.println("Write number of tests");
        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine());
        ArrayList<int[]> numeros = new ArrayList<>();
        for (int i = 0; i < T; i++){
            System.out.println("Reading line...");
            int[] array = new int[3];
            array[0] = scanner.nextInt(); // 8001, 4003, 1000, 2000,
            array[1] = scanner.nextInt(); // x
            array[2] = scanner.nextInt(); // y
            numeros.add(array);
            String nextP = scanner.nextLine();
            // ""
        }
        for (int[] line : numeros){
            int number = line[0];
            int n1 = line[1];
            int n2 = line[2];
            int tent = number / n1 * n1; // 999
            if (tent == number){
                System.out.println("SIM");
                continue;
            }
            while (true){
                tent -= n1; // 3
                int rest = number - tent;
                // 1000 - 996
                // rest is 4,
                // rest is 7.
                int division = rest/n2;
                if (division > 0){
                    if (tent + n2 * division == number) {
                        System.out.println("SIM");
                    } else {
                        System.out.println("NÃO");
                    }
                    break;
                }
            }
        }
    }

}
