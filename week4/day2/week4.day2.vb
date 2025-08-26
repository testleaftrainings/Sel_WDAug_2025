10:00 to 11:00 ---> WebTable
11:00 to 11.30 ---> Breakout 
11.30to 12.30 ---> TestNG Basics
12.30 to 1:00 ---> Breakout

Webtable:
1)Static--->rows and columns remains unchanged(value may change)
2)dynamic---->rows and columns changed according to the data.

structure:
<table>
   <thead>--->theader
    <tr>---->header row
     <th>--->column info
     </th>
    
    </tr>
 
  </thead>

  <tbody>
   <tr>--->table row
    <td>--->tabledata
    
    </td>

   </tr>
 
  </tbody>

 </table>

 SoftWares required for TestNg:
 1)TestNG plugins--->compile and execute the testcases.
 2)dependencies--->added in pom.xml for developing the testscripts

 steps for converting into TestNg script:
 1)convert the main method into normal method.
  a)remove static,stringargs[]
  2)remove main and Give a valid method name.
2)Add @Test before the method and import it.
