package oop.inheritance;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MainTest {

    @Test
    public void when1IsTyped_thenDoSaleIsCalled(){
        Application application = Mockito.mock(Application.class);

        Mockito.when(application.readKey()).thenReturn("1");

        Main.run(application);

        Mockito.verify(application).clearScreen();
        Mockito.verify(application).showMenu();
        Mockito.verify(application).readKey();
        Mockito.verify(application).doSale();

        Mockito.verifyNoMoreInteractions(application);
    }

    @Test
    public void when2IsTyped_thenDoRefundIsCalled(){
        Application application = Mockito.mock(Application.class);

        Mockito.when(application.readKey()).thenReturn("2");

        Main.run(application);

        Mockito.verify(application).clearScreen();
        Mockito.verify(application).showMenu();
        Mockito.verify(application).readKey();
        Mockito.verify(application).doRefund();

        Mockito.verifyNoMoreInteractions(application);
    }

    @Test
    public void when3IsTyped_thenPrintReportIsCalled(){
        Application application = Mockito.mock(Application.class);

        Mockito.when(application.readKey()).thenReturn("3");

        Main.run(application);

        Mockito.verify(application).clearScreen();
        Mockito.verify(application).showMenu();
        Mockito.verify(application).readKey();
        Mockito.verify(application).printReport();

        Mockito.verifyNoMoreInteractions(application);
    }

    @Test
    public void when4IsTyped_thenShowConfigurationIsCalled(){
        Application application = Mockito.mock(Application.class);

        Mockito.when(application.readKey()).thenReturn("4");

        Main.run(application);

        Mockito.verify(application).clearScreen();
        Mockito.verify(application).showMenu();
        Mockito.verify(application).readKey();
        Mockito.verify(application).showConfiguration();

        Mockito.verifyNoMoreInteractions(application);
    }

}
