/***************************** BEGIN LICENSE BLOCK ***************************

The contents of this file are subject to the Mozilla Public License, v. 2.0.
If a copy of the MPL was not distributed with this file, You can obtain one
at http://mozilla.org/MPL/2.0/.

Software distributed under the License is distributed on an "AS IS" basis,
WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
for the specific language governing rights and limitations under the License.
 
Copyright (C) 2012-2015 Sensia Software LLC. All Rights Reserved.
 
******************************* END LICENSE BLOCK ***************************/

package net.opengis.swe.v20;

import net.opengis.IDateTime;


/**
 * POJO class for XML type TimeType(@http://www.opengis.net/swe/2.0).
 *
 * This is a complex type.
 */
@SuppressWarnings("javadoc")
public interface Time extends ScalarComponent, HasRefFrames, HasUom, HasConstraints<AllowedTimes>
{
    public static final String ISO_TIME_UNIT = "http://www.opengis.net/def/uom/ISO-8601/0/Gregorian";
    
    
    @Override
    public Time copy();
    
    
    /**
     * Gets the value property
     */
    public IDateTime getValue();
    
    
    /**
     * Checks if value is set
     */
    public boolean isSetValue();
    
    
    /**
     * Sets the value property
     */
    public void setValue(IDateTime value);
    
    
    /**
     * Gets the referenceTime property
     */
    public IDateTime getReferenceTime();
    
    
    /**
     * Checks if referenceTime is set
     */
    public boolean isSetReferenceTime();
    
    
    /**
     * Sets the referenceTime property
     */
    public void setReferenceTime(IDateTime referenceTime);
    
    
    /**
     * @return true if time is encoded as ISO8601 string
     */
    public boolean isIsoTime();
}
