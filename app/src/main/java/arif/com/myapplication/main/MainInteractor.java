package arif.com.myapplication.main;

/**
 * Created by Dream71 on 30/10/2017.
 */

public interface MainInteractor {
  interface MainAfterClicedPerformed{

      void ButtonClicked(int ClickType);
  }
  void MainAfterCliced(int Type,MainAfterClicedPerformed mainAfterClicedPerformed);
}
