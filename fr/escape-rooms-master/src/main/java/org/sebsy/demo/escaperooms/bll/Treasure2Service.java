package org.sebsy.demo.escaperooms.bll;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("treasure")
@Service
public class Treasure2Service implements TreasureService {

    @Override
    public String ouvrir() {
        return "Gagné, vous avez trouvé la salle du trésor !";
    }
}