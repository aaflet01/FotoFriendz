package categoricals;

import generics.LinearUnit;
import generics.MapDistance;

public enum MatchDistance {
    D1(new MapDistance(1d, LinearUnit.Mile)),
    D2(new MapDistance(2d, LinearUnit.Mile)),
    D3(new MapDistance(5d, LinearUnit.Mile)),
    D4(new MapDistance(10d, LinearUnit.Mile)),
    D5(new MapDistance(100d, LinearUnit.Mile));

    private MapDistance distance;

    MatchDistance(MapDistance distance) {
        this.distance = distance;
    }


}
