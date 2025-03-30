 class printer {
    void print(int a){
        System.out.println(a);
    }
    void print(String a){
        System.out.println(a);
    }
    void print(double a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        printer obj = new printer();
        obj.print(2);
        obj.print(3);
        obj.print("ayush");
    }
}
