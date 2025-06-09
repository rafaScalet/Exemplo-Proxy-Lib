package thirdPartyLib;

public class Library implements ILibrary {
  @Override
  public void exec() {
    System.out.println("Third Party Lib is executing");
  }

  @Override
  public void list() {
    System.out.println("Third Party Lib is listing");
  }

  @Override
  public void stop() {
    System.out.println("Third Party Lib is stoping");
  }
}
