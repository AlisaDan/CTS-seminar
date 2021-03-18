package ro.ase.cts.threadsafe;

public class Program {
    public static void main(String[] args) {
        Adeverinta adeverinta=Adeverinta.getInstance("Dan","Alisa","pentru CNAS",213123);
        Adeverinta adeverinta2=Adeverinta.getInstance("Dan","Georgiana","pentru sanatate",43123);

        System.out.println(adeverinta);
        System.out.println(adeverinta2);

        adeverinta.setTipAdeverinta("tip");
        adeverinta.setCodStudent(234234);
        adeverinta.setPrenumeStudent("Maria");
        adeverinta.setNumeStudent("Constantinescu");

        System.out.println(adeverinta.getTipAdeverinta()+" "+adeverinta.getNumeStudent()+" "+adeverinta.getCodStudent()+" "+adeverinta.getPrenumeStudent());

        System.out.println(adeverinta);
    }
}
