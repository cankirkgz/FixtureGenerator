<h1>Fixture Generator</h1>

  <p>The Fixture Generator is a Java class that generates random match fixtures for a given list of teams. It follows the rules of a double round-robin league format, where each team plays two matches against every other team, once at home and once away.</p>

   <h2>Features</h2>
   <ul>
        <li>Generates a fixture list for an even number of teams.</li>
        <li>If the number of teams is odd, it adds a "Bay" team to complete the even number of teams. The teams matched with "Bay" do not play any matches during that round.</li>
        <li>The number of rounds played is twice the number of teams minus one.</li>
        <li>Each round displays the matches for that round.</li>
    </ul>

   <h2>How to Use</h2>
   <ol>
        <li>Ensure that you have Java installed on your system.</li>
        <li>Clone this repository or download the <code>FixtureGenerator.java</code> file.</li>
        <li>Open the <code>FixtureGenerator.java</code> file in a Java IDE or text editor.</li>
        <li>Modify the <code>teams</code> list in the <code>main</code> method to include the desired team names.</li>
        <li>Run the <code>main</code> method to generate the fixture list.</li>
        <li>The fixture list will be displayed in the console.</li>
    </ol>

   <h3>Example Usage</h3>
   <pre><code>
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FixtureGenerator {
    public static void main(String[] args) {
        List&lt;String&gt; teams = new ArrayList&lt;&gt;();
        teams.add("Galatasaray");
        teams.add("Bursaspor");
        teams.add("Fenerbahçe");
        teams.add("Beşiktaş");
        teams.add("Başakşehir");
        teams.add("Trabzonspor");

        generateFixture(teams);
    }

    // Rest of the code...
}
    </code></pre>

   <p>In the example above, a list of teams is provided, and the <code>generateFixture</code> method is called with the teams list to generate the fixture. The fixture list will be displayed in the console.</p>

   <h2>License</h2>
   <p>This project is licensed under the <a href="LICENSE">MIT License</a>.</p>

   <p>Feel free to use, modify, and distribute this code as needed.</p>
