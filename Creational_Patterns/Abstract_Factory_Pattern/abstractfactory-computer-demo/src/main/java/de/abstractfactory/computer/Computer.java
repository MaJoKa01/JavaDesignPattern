package de.abstractfactory.computer;

class Computer {
    CPU cpu;

    public Computer(CPUFactory factory) {
        cpu = factory.produceCPU();
        cpu.process();
    }
}
