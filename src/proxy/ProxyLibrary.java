package proxy;

import thirdPartyLib.ILibrary;

public class ProxyLibrary implements ILibrary {
  ILibrary lib;

  public ProxyLibrary(ILibrary lib) {
    this.lib = lib;
  }

  @Override
  public void exec() {
    lib.exec();
    System.out.println("Execução cacheada");
  }

  @Override
  public void list() {
    System.out.println("O Proxy está verificando a chamada para listagem");
    lib.list();
  }

  @Override
  public void stop() {
    lib.stop();
  }
}
