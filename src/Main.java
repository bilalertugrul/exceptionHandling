public class Main {
    public static void main(String[] args) {

        //try-catch-finally hata yönetimi exception yapısı
        //hatanın türüne göre birden fazla catch yazarak kullanıcı yönlendirilebilir.

        try{
            int[] numbers = new int[] {3,5,7};
            System.out.println(numbers[4]);
        }catch (StringIndexOutOfBoundsException exception){
            System.out.println("Hata String : " + exception);
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Hata Array : " + exception);
        }
        catch (Exception exception){
            System.out.println("Hata Exception : " + exception);
        }finally {
            //try ile açılan bağlantının kapatılması gereken yer
            System.out.println("hata olsada olmasa da çalışan blok");
        }

    }
}