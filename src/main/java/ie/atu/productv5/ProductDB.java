package ie.atu.productv5;


public class ProductDB {

    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would get the data for the product from a file or database
        // For now, this code just uses if/else statements to return the correct product data

        //We need all the book and software objects, but what kind of object do we return?
        //}
        Product myProduct = null;
        //myProduct = new ie.atu.productv5.Product();

        Book myBook = null;
        if (productCode.equalsIgnoreCase("java")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myProduct = myBook;

        } else if (productCode.equalsIgnoreCase("jsp")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            myProduct = myBook;

        } else if (productCode.equalsIgnoreCase("mysql")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            myProduct = myBook;
        }


        Software mySoftware = null;
        if (productCode.equalsIgnoreCase("studios")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
        } else if (productCode.equalsIgnoreCase("oracle")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            myProduct = mySoftware;
        }
        if (productCode.equalsIgnoreCase("studios")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myProduct = mySoftware;
        }
        Music myMusic = null;
        if (productCode.equalsIgnoreCase("pink")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Wish you were here ");
            myMusic.setPrice(8.00);
            myMusic.setArtist("Pink Floyd");
            myMusic.setLabel("Columbia Records");
            myProduct = myMusic;
        }

        TV myTV = null;
        if (productCode.equalsIgnoreCase("kdl43")) {
            myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Sony Bravia Smart TV KDL43WF663 ");
            myTV.setPrice(8.00);
            myTV.setManufacturer("Sony");
            myTV.setScreen_Size(55);
            myProduct = myTV;
        }





        return myProduct;
    }
}

