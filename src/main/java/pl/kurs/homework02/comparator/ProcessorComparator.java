package pl.kurs.homework02.comparator;

import pl.kurs.homework02.model.Computer;
import pl.kurs.homework02.model.Processor;

import java.util.Comparator;

public class ProcessorComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer o1, Computer o2) {
        Processor o1Processor = o1.getProcessor();
        Processor o2Processor = o2.getProcessor();
        int result = o1.getProcessor().getModel().compareTo(o2.getProcessor().getModel());
        if (result == 0) {
            result = Double.compare(o2.getProcessor().getNodesNM(), o1.getProcessor().getNodesNM());
        }
        if (result == 0) {
            result = Double.compare(o1.getProcessor().getProcessorClockSpeedGHZ(), o2.getProcessor().getProcessorClockSpeedGHZ());
        }
        return result;
    }
}
