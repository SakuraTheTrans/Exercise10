public class Main {
    public static void main(String[] args) {

        Contact sakura = new Contact("Sakura", "sakurathetrans@gmail.com");
        Contact astra = new Contact("Astra", "astramakesthings@gmail.com");
        Contact qoq = new Contact("Quill Of Creation", "quillcreations@gmail.com");

        Collection contactCollection = new Collection();
        contactCollection.addContact(sakura);
        contactCollection.addContact(astra);
        contactCollection.addContact(qoq);


        for (Contact a : contactCollection) {
            System.out.println(a);
        }

        }
    }