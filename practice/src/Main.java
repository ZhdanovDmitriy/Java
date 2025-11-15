
void main() {
    Scanner console = new Scanner(System.in);
    int a = console.nextInt();
    int i = (a == 1) ? 1 : (a == 2) ? 2 : 3;
    /*Аналогично:
    int i = 0;
    if (a == 1) {3
        i = 1;
    } else if (a == 2) {
        i = 2;
    } else {
        i = 3;
    }
     */
    System.out.println(i);
}
