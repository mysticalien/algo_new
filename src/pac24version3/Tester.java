package pac24version3;
interface ICreateDocument {
    IDocument createNew();
}

interface IDocument {
    void create();
    void open();
    void save();
    void exit();
}

class CreateTextDocument implements ICreateDocument {
    @Override    public IDocument createNew() {
        return new TextDocument();
    }
}

class Editor {
    private final IDocument document;
    public Editor(ICreateDocument factory) {
        this.document = factory.createNew();
    }
    public void newDocument() {
        document.create();
    }
    public void openDocument() {
        document.open();
    }
    public void saveDocument() {
        document.save();
    }
    public void exitDocument() {
        document.exit();
    }
}

class TextDocument implements IDocument {
    @Override
    public void create() {
        System.out.println("Creating a new text document");
    }

    @Override
    public void open() {
        System.out.println("Opening a text document");
    }

    @Override
    public void save() {
        System.out.println("Saving the text document");
    }

    @Override
    public void exit() {
        System.out.println("Exiting the text document");
    }
}

public class Tester {
    public static void main(String[] args) {
        // Создание фабрики для текстовых документов
        ICreateDocument textFactory = new CreateTextDocument();
        // Создание каркаса приложения для текстового редактора
        Editor textEditor = new Editor(textFactory);
        // Демонстрация работы каркаса на примере текстового редактора
        textEditor.newDocument();
        textEditor.openDocument();
        textEditor.saveDocument();
        textEditor.exitDocument();
    }
}
