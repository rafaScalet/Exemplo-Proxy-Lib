import proxy.ProxyLibrary;
import thirdPartyLib.Library;

public class Main {
  public static void main(String[] args) {
    Library lib = new Library();
    ProxyLibrary proxy = new ProxyLibrary(lib);

    System.out.println("\nExecução pela Lib:");
    lib.exec();
    lib.list();
    lib.stop();

    System.out.println("\nExecução pelo Proxy:");
    proxy.exec();
    proxy.list();
    proxy.stop();
  }
}
