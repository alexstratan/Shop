package data;

import java.time.LocalDate;
import java.util.Date;

public class Product {

    public Product(String name, Double buyingPrice, Double sellingPrice, LocalDate expirationDate, String description, int stock) {
        this.name = name;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.expirationDate = expirationDate;
        this.description = description;
        this.stock = stock;
        ID = ProductManager.getListSize();
    }


    private final int ID;
    private String name;
    private Double buyingPrice;
    private Double sellingPrice;
    private LocalDate expirationDate;
    private String description;
    private int stock;


    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(Double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }


    public String getDescription() {
        return description;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}


/*
* Creați o aplicație consolă de tipul: Magazin de produse.



Funcționalitate necesară:
1. Adăugarea produselor în magazin. La lansarea aplicatiei se introduc X produse si se pastreaza in memoria interna.
Ce informații despre produs ar trebui specificate: numele produsului, prețul de cumpărare, prețul de vânzare, data de expirare, descrierea, stocul (cantitatea).
2. Afișarea întregul stoc.
3. Vinderea un produs: se alege un produs si se specifica cantitatea necesara - aplicatia il scoate din stoc.
4. Profit: calcularea veniturilor și afișarea profitului.
5. Profit pe produs: calcularea profitului pentru fiecare produs individual (profit per produs = cantitatea x (pret de vanzare - pret de cumparare)).
6. Sortare: afișați produsele
1. După nume - în ordine alfabetică
2. După data de expirare - în ordine inversă (produsele cu cea mai apropiata dată de expirare merg primele)
3. După preț în ordine crescătoare.
4. După preț în ordine descrescătoare.



CE VA FI EVALUAT IN PRIMUL RAND:
1. Respectarea principiilor OOP și separarea responsabilităților pe clasele necesare.
2. Prezența metodelor necesare pentru a efectua operațiile descrise mai sus (chiar daca metoda nu este chemata sau nu este implementata logica de executie, va fi analizata solutia descrisa in metoda).



FUNCȚIONALITĂȚI OPȚIONALE:
Afisarea meniului si introducerea datelor de la tastatură nu sunt obligatorii - prezentați funcționalitatea aplicației in mod manual într-o clasă principală Main.



IMPORTANT: Sarcina trebuie incarcata intr-un repozitoriu Github (ProductStore) pana la ora 21:00.
*
*
* */