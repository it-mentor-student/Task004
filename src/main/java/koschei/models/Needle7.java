package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Needle7 {

    private Death8 death8 = new Death8();

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + death8.toString();
    }
}