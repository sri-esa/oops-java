class multi_table{
    int num;
    void printTable(){
        for(int i=1;i<=10;i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
public class Table {
    public static void main(String[] args){
        multi_table t1=new multi_table();
        t1.num=7;
        t1.printTable();
    }
}
