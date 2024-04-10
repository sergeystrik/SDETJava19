package org.example.class19;
//Create a class File that will have the following behaviors: open, edition, closed and fields like name and size.
// Edit and close are implemented method while open is an abstract. Create 3 subclasses:
//JavaFile,
//WordFile, PdfFile that will
//provide specific implementation of open behaviour: Example: to open java file we need notepad++ or sublime text,
// to open doc file we need Microsoft Word to be installed etc. Create a tester class and call all of the methods from these classes.

abstract class File {
    protected String name;
    protected int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void open() {

    }

    public void edit() {
        System.out.println("Editing file: " + name);
    }

    public void close() {
        System.out.println("Closing file: " + name);
    }
}

class JavaFile extends File {
    public JavaFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("Opening Java file '" + name + "' with Notepad++");
    }
}
class WordFile extends File {
    public WordFile(String name, int size) {
        super(name, size);
    }
    @Override
    public void open() {
        System.out.println("Opening Word file '" + name + "' with Microsoft Word");
    }
}class PdfFile extends File {
    public PdfFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("Opening PDF file '" + name + "' with Adobe Acrobat Reader");
    }
}

class Tester {
    public static void main(String[] args) {
            File[] files = {
                    new JavaFile("example.java", 100),
                    new WordFile("example.docx", 200),
                    new PdfFile("example.pdf", 150)
            };

            for (File file : files) {
                file.open();
                file.edit();
                file.close();
                System.out.println();
            }
        }
    }

