# PostOfficeRevived
<h1>A tech touch to the traditional Post Office System</h1>
<p>The application jar can be found under PostOfficeRevived/lib/PostOfficeRevived-1.0-SNAPSHOT.jar</p>
<p>The following options are provided in the application</p>
<p>1. Compose Letter:Following Details are to be entered
<ul>
<li>From Address</li>
<li>To Address</li>
<li>Stamp Price</li>
<li>Letter Content</li>
</ul>
</p>
<p>2. Review Letter: Displays the above entered information</p>
<p>3. Edit Letter: Upon Review if any mistakes found then the Letter can be edited
<p>You can choose to Re-enter From Address, To Address, Stamp Price and Letter Content</p></p>
<p>4. Send Letter: There are 2 outcomes
<ul>
  <li>Post Sent: The state field of the To Address and From Address are taken into account to decide whether a within state or across state boundries stamp is required. This is checked with the stamp attached.</li>
  <li>Stamp atatched is of insufficient value: Incase the stamp isn't of required price</li>
</ul>
</p>
<p>5. I am done: Quit the application</p> 

<p>Note:
  <p>Attempt at implementing SOLID concepts :
    <ul>
   <li>Dependency Injection in the unit tests written for PostSender class</li>
   <li>Open..Close principle by encapsulating the data in Letter and Address class</li>
   <li>Single Responsibility concept by seggregating methods and variable pertaining to one function of application in one class</li>
   <li>Letter Content</li>
      
</ul>
</p>
<p>Attempted to maintain method, variable and class names simple and relevant</p>
<p>Cases cases handled
<ul>
<li>Send,Edit or review of post/letter without composing one</li>
<li>Empty input field check</li>
  <li>Provision to send more than one letter</li>
</ul></p>
 </p> 
