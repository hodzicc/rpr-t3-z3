package ba.unsa.etf;

class prvaTest {

    private intefzamock interfejs;

    @org.junit.jupiter.api.Test
    void metoda() {
        interfejs = Mockito.mock(intefzamock.class);

        prva var = new prva(interfejs);

        Mockito.when(interfejs.nekametoda()).thenReturn("neko");

        assertEquals(gg, var.metoda())
        
    }
}