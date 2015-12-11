/**
 * This file is part of EWItool.
 *
 *  EWItool is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  EWItool is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with EWItool.  If not, see <http://www.gnu.org/licenses/>.
 */

package ewitool;

import javafx.geometry.HPos;
import javafx.geometry.Orientation;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;

/**
 * @author steve
 *
 */
public class UiNoiseGrid extends GridPane {
  
  Slider timeSlider, breathSlider, volSlider;
  
  UiNoiseGrid() {
    
    setId( "editor-grid" );
    
    Label mainLabel = new Label( "Noise" );
    mainLabel.setId( "editor-section-label" );
    add( mainLabel, 0, 0 );
    
    timeSlider = new Slider( 0.0, 127.0, 0.0 );
    timeSlider.setOrientation( Orientation.HORIZONTAL );
    timeSlider.setMajorTickUnit( 32.0 );
    add( timeSlider, 0, 2 );
    add( new BoundBelowControlLabel( "Time", HPos.CENTER, timeSlider ), 0, 1 );
    
    breathSlider = new Slider( 0.0, 127.0, 0.0 );
    breathSlider.setOrientation( Orientation.HORIZONTAL );
    breathSlider.setMajorTickUnit( 32.0 );
    add( breathSlider, 0, 4 );
    add( new BoundBelowControlLabel( "Breath", HPos.CENTER, breathSlider ), 0, 3 );
    
    volSlider = new Slider( 0.0, 127.0, 0.0 );
    volSlider.setOrientation( Orientation.VERTICAL );
    volSlider.setMajorTickUnit( 32.0 );
    GridPane.setRowSpan( volSlider, 4 );
    add( volSlider, 1, 1 );
    add( new BoundBelowControlLabel( "Vol", HPos.CENTER, volSlider ), 1, 0 );
  }
  


}