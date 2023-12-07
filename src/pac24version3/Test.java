package pac24version3;
interface Chair {
    void sitOn();
}

interface ChairAbstractFactory {
    Chair createVictorianChair();
    Chair createMultifunctionalChair();
    Chair createMagicChair();
}

class Client {
    public void sit(Chair chair) {
        chair.sitOn();
    }
}

class ConcreteChairFactory implements ChairAbstractFactory {
    @Override    public Chair createVictorianChair() {
        return new VictorianChair();
    }
    @Override
    public Chair createMultifunctionalChair() {
        return new MultifunctionalChair();
    }
    @Override
    public Chair createMagicChair() {
        return new MagicChair();
    }
}

class MagicChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a magic chair");
    }
}

class MultifunctionalChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a multifunctional chair");
    }
}

class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian chair");
    }
}

public class Test {
    public static void main(String[] args) {
        // Создание объекта фабрики стульев
        ChairAbstractFactory factory = new ConcreteChairFactory();
        // Создание Викторианского стула
        Chair victorianChair = factory.createVictorianChair();
        // Создание Многофункционального стула
        Chair multifunctionalChair = factory.createMultifunctionalChair();
        // Создание Магического стула
        Chair magicChair = factory.createMagicChair();
        // Создание клиента и использование метода Sit для каждого стула
        Client client = new Client();
        client.sit(victorianChair);
        client.sit(multifunctionalChair);
        client.sit(magicChair);
    }
}
