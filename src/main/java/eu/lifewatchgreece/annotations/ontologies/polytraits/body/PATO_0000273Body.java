/*
 *
 * Copyright 2015 FORTH-ICS-ISL (http://www.ics.forth.gr/isl/)
 * Foundation for Research and Technology - Hellas (FORTH)
 * Institute of Computer Science (ICS)
 * Information Systems Laboratory (ISL)
 *
 * Licensed under the EUPL, Version 1.1 or – as soon they
 * will be approved by the European Commission - subsequent
 * versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the
 * Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl/licence-eupl
 *
 * Unless required by applicable law or agreed to in
 * writing, software distributed under the Licence is
 * distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied.
 * See the Licence for the specific language governing
 * permissions and limitations under the Licence.
 *
 */
package eu.lifewatchgreece.annotations.ontologies.polytraits.body;

import eu.lifewatchgreece.annotations.ontologies.polytraits.namespace.POLYTRAITS;
import org.openrdf.annotations.Iri;

/**
 * Fecundity:The potential reproductive capacity of an organism or population,
 * measured by the number of gametes (eggs) or asexual propagules [1292].
 */
@Iri(POLYTRAITS.PATO_0000273)
public abstract class PATO_0000273Body implements PolytraitsBody {

    /**
     * Check that the annotation has a valid value
     *
     * @return
     */
    @Override
    public boolean isValid() {
        switch (getValue()) {
            /* 1-50: Up to 50 eggs per female and reproductive event.*/
            case POLYTRAITS.PATO_0000273_FEC_50:
            /* 50-500: From 50 to 500 eggs per female and reproductive event.*/
            case POLYTRAITS.PATO_0000273_FEC_500:
            /* 500-2,500: From 500 to 2,500 eggs per female and reproductive event.*/
            case POLYTRAITS.PATO_0000273_FEC_2500:
            /* 2,500-10,000: From 2,500 to 10,000 eggs per female and reproductive event.*/
            case POLYTRAITS.PATO_0000273_FEC_10000:
            /* 20,000-100,000: From 20,000 to 100,000 per female and reproductive event.*/
            case POLYTRAITS.PATO_0000273_FEC_20000:
            /* >100,000: More than 100,000 eggs per female and reproductive event.*/
            case POLYTRAITS.PATO_0000273_FEC_100000:
            /* >100,000: More than 100,000 eggs per female and reproductive event.*/
            case POLYTRAITS.PATO_0000273_FEC_MORE_THAN_100000:
                return true;
            default:
                return false;
        }
    }

    @Override
    public String toString() {
        return "PATO_0000273Body{"
                + "value='" + getValue() + '\''
                + "}";
    }
}
