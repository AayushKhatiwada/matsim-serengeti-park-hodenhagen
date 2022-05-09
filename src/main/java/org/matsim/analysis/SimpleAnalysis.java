package org.matsim.analysis;

import org.matsim.core.events.EventsUtils;
import org.w3c.dom.events.Event;


public class SimpleAnalysis {
    public static void main(String[] args) {
        var handler = new SimplePersonEventHandler();
        var manager = EventsUtils.createEventsManager();
        manager.addHandler(handler);

        EventsUtils.readEvents(manager,"/Users/aayush02/IdeaProjects/matsim-serengeti-park-hodenhagen/scenarios/serengeti-park-v1.0/output/output-serengeti-park-v1.0-run1/ITERS/it.10/serengeti-park-v1.0-run1.10.events.xml.gz");


    }

}
