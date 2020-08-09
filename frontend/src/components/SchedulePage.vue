<template>
<v-main> 

           <v-container class="margin-bottom">
              <template>
                    <v-card>
                        <v-card-text>
                        <h1 class="text-md-center , font-weight-light , font" style="color:#0c494e">
                            Schedules 
                        </h1>
                        
                        </v-card-text>
                    </v-card>
                </template> 
          </v-container>

           <v-container class="margin-bottom">
              <h1 class="text-md-center , font-weight-light , font" style="color:#0c494e" > These are two possible yearly schedules. The first schedule has been put through the algorithm to create the optimal schedule, while the second is a schedule picked at random</h1>
          </v-container>



    <template >
  <v-expansion-panels focusable>
  <v-expansion-panel>
  <v-expansion-panel-header><h2 class="text-center , font-weight-light , font" style="color:#0c494e">Optimized Schedule</h2> </v-expansion-panel-header>
  <v-expansion-panel-content>

  <v-timeline :dense="$vuetify.breakpoint.smAndDown" >
    <div v-for='(tourn, index) in optArray' v-bind:key="tourn ">
    <v-timeline-item
      color="#0c494e"
      fill-dot
      left
      v-if= "index%2 == 0 || index == 65"
    >
      <v-card >
        <v-card-title >
          
            
          <h2 class="display-1 black--text font-weight-light, font">Week: {{tourn.weekNo}}</h2>
        </v-card-title>
        <v-container>
          <v-row>
            <v-col cols="12" md="10">
              <p class="description-size, font">{{tourn.name}}</p>
            </v-col>
            <v-col
              class="hidden-sm-and-down text-right"
              md="2"
            >
            
            </v-col>
          </v-row>
        </v-container>
      </v-card>
    </v-timeline-item>

    <v-timeline-item
      color="#0c494e"
      fill-dot
      right
      v-if= "index%2 == 0 || index == 65"
    >
      <v-card >
        <v-card-title >
          <h2 class="display-1 black--text font-weight-light, font">Tournament Details</h2>
        </v-card-title>
        <v-container >
          
            
              <ul>
                <p class="description-size, font">Week Number :{{tourn.weekNo}}</p>
                <p class="description-size, font">Prize Money :${{tourn.tMoney}}</p>
                <p class="description-size, font">Points :{{tourn.tPoints}}</p>

              </ul>
            
            
          
        </v-container>
      </v-card>
    </v-timeline-item>

    
    </div>
  </v-timeline>
  </v-expansion-panel-content>
  </v-expansion-panel>
   </v-expansion-panels>
    </template>
          

    
    <template >
  <v-expansion-panels focusable>
  <v-expansion-panel>
  <v-expansion-panel-header><h2 class="text-center , font-weight-light , font" style="color:#0c494e">Un-Optimized Schedule</h2>  </v-expansion-panel-header>
  <v-expansion-panel-content>

  <v-timeline :dense="$vuetify.breakpoint.smAndDown" >
    <div v-for='(tourns, index) in oppArray' v-bind:key="tourns ">
    <v-timeline-item
      color="#0c494e"
      fill-dot
      left
      v-if= "index%2 == 0 || index == 65"
    >
      <v-card >
        <v-card-title >
          
            
          <h2 class="display-1 black--text font-weight-light, font">Week: {{tourns.weekNo}}</h2>
        </v-card-title>
        <v-container>
          <v-row>
            <v-col cols="12" md="10" >
              <p class="description-size, font">{{tourns.name}}</p>
            </v-col>
            <v-col
              class="hidden-sm-and-down text-right"
              md="2"
            >
            
            </v-col>
          </v-row>
        </v-container>
      </v-card>
    </v-timeline-item>

    <v-timeline-item
      color="#0c494e"
      fill-dot
      right
      v-if= "index%2 == 0 || index == 65"
    >
      <v-card >
        <v-card-title >
          <h2 class="display-1 black--text font-weight-light, font">Tournament Details</h2>
        </v-card-title>
        <v-container >
          <v-row>
            <v-col cols="12" md="10" >
              <ul>
                
                <p class="description-size, font">Week Number :{{tourns.weekNo}}</p>
                <p class="description-size, font">Prize Money :${{tourns.tMoney}}</p>
                <p class="description-size, font">Points :{{tourns.tPoints}}</p>

              

              </ul>
            </v-col>
            <v-col
              class="hidden-sm-and-down text-right"
              md="2"
            >
            
            </v-col>
          </v-row>
        </v-container>
      </v-card>
    </v-timeline-item>

    
    </div>
  </v-timeline>
  </v-expansion-panel-content>
  </v-expansion-panel>
   </v-expansion-panels>
    </template>
     

      <v-container >
        <v-row
          align="center"
          justify="center"
        >
          <v-content>
          
               
          <v-container class="margin-bottom" style="margin-top:100px">
              <h1 class="text-md-center , font-weight-light , font" style="color:#0c494e" > Below is a comparison between the optimal schedule and a schedule picked at random.</h1>
          </v-container>

      

          <template>
    <v-container style="margin-top:50px" >
        <v-row>
      <v-col  sm="6" >
        <h1 style="color:#0c494e " class="text-md-center , font-weight-light , font">Optimized</h1>
      </v-col>

      <v-col  sm="6">
        <h1 style="color:#0c494e " class="text-md-center , font-weight-light , font">Un-Optimized</h1>
      </v-col>
  
    </v-row>
    </v-container>
    </template>
              
          

            <template>
    <v-container style="margin-top:50px" >
        <v-row>
      <v-col  sm="4" >
        <h1 class="font , center" style="color:#0c494e  ;font-size:40px">${{schedDetails[0]}}</h1>
      </v-col>

      <v-col  sm="4">
        <v-img src="/littlemanplayingtennis.jpg" 
        contain
        style="height:60%">
          
        </v-img>
      </v-col>

      <v-col  sm="4">
        <v-col  sm="4" >
        <h1 class="font , center" style="color:#0c494e  ;font-size:40px">${{oppSchedDetails[0]}}</h1>
      </v-col>
      </v-col>
    </v-row>
    </v-container>
    </template>

    <template>
    <v-container >
        <v-row>
      <v-col  sm="4">
        <v-col  sm="4" >
        <h1 class="font , center" style="color:#0c494e  ;font-size:40px">{{schedDetails[1]}}pts</h1>
      </v-col>
      </v-col>

      <v-col  sm="4">
        <v-img src="/winwithotext.jpg" 
        contain
        style="height:60%">
          
        </v-img>
      </v-col>

      <v-col  sm="4">
                <h1 class="font , center" style="color:#0c494e  ;font-size:40px">{{oppSchedDetails[1]}}pts</h1>
      </v-col>
    </v-row>
    </v-container>
    </template>

    <template>
    <v-container >
        <v-row>
      <v-col  sm="4">
        <v-col  sm="4" >
        <h1  class="font , center" style="color:#0c494e  ;font-size:40px">{{schedDetails[2]}}km</h1>
      </v-col>
      </v-col>

      <v-col  sm="4">
        <v-img src="/aeroplanefly.jpg" 
        contain
        style="height:60%">
          
        </v-img>
      </v-col>

      <v-col  sm="4">
                <h1 class="font , center" style="color:#0c494e  ;font-size:40px">{{oppSchedDetails[2]}}km</h1>
      </v-col>
    </v-row>
    </v-container>
    </template>
                
              
      
                   
          </v-content>
        </v-row>
      </v-container>
    </v-main>
</template>

<script>
  export default {
    props: {
      source: String,
    },
    data(){
           return{
               optArray: [] ,
               tournArray: [],
               oppArray:[],
               schedDetails:[],
               oppSchedDetails:[]
           }
        },
        drawer: null,
        created(){
           fetch("http://localhost:8080/schedule")
               .then(response => {
                   return response.json();
               })
                .then(optArray => {
                    this.optArray = optArray;
                }),
                fetch("http://localhost:8080/tournaments")
               .then(response => {
                   return response.json();
               })
                .then(tournArray => {
                    this.tournArray = tournArray;
                }),
                fetch("http://localhost:8080/oppSchedule")
               .then(response => {
                   return response.json();
               })
                .then(oppArray => {
                    this.oppArray = oppArray;
                }),
                fetch("http://localhost:8080/schedule-details")
               .then(response => {
                   return response.json();
               })
                .then(schedDetails => {
                    this.schedDetails = schedDetails;
                }),
                fetch("http://localhost:8080/opp-schedule-details")
               .then(response => {
                   return response.json();
               })
                .then(oppSchedDetails => {
                    this.oppSchedDetails = oppSchedDetails;
                })
        },
        
  }
</script>

<style>
.description-size{
  font-size: 40px;
  font-weight: lighter;
}

.margin-bottom{
    margin-bottom: 100px;
}


  .font{
    font-family: 'Antic Didone'
  }

  .center {
  display: block;
  margin-left: auto;
  margin-right: auto;
  margin-top: 75px;
  margin-bottom: 100px;
}


</style>