package StrukDat;



public class Queue {
    private String[] sepedamotor;
    private int size;
    private int kepala;
    private int ekor;

    public Queue(int jumlah) {
       kepala=-1;
       ekor=-1;
      size= jumlah;
      sepedamotor = new String[size];

    }

    public  boolean isEmpty (){
        return kepala == -1;
    }

    public boolean isFull (){
        return ekor == -1;
    }

    public void tambah (String input){
        if (isEmpty()){
            sepedamotor[++kepala] = input;
            ekor++;
        } else {
            if (isFull()){
                System.out.println("telah penuh");
            } else {
                sepedamotor[++ekor]=input;
            }
        }

        System.out.println(input);

    }

    public void hapus () {
        if(isEmpty()){
            System.out.println("kosong");
        } else {
            String temp = sepedamotor[kepala];
            for (int i =0; i<ekor; i++){
                sepedamotor[i]=sepedamotor[i+1];
            }
            ekor--;
            System.out.println(temp);
        }
    }

    public void info (){
        for (int i =0; i<=ekor; i++){
            System.out.println(sepedamotor[i]);
        }
    }



    public static void main(String[] args) {
        Queue queue = new Queue (5);
        System.out.println("Sebelum di queue");
        queue.tambah("Beat");
        queue.tambah("Vario");
        queue.tambah("Nmax");
        queue.tambah("Jupiter");
        queue.tambah("Vixion");

        queue.info();
        System.out.println("setelah diqueue");
        queue.hapus();
        queue.hapus();
        queue.hapus();
        queue.hapus();
        queue.hapus();





    }



}
