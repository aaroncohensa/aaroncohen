<template>

    <v-main>
    <link href='https://fonts.googleapis.com/css?family=Antic Didone' rel='stylesheet'>
    <v-container >


            
    
      <div style="background-image: url('courts2.jpeg'); background-size:100%;">
        <div >
           <div>
               
               <img 
               cover
               height="800px"
               
               
               >
           </div>
        </div>
        </div>  


            
    </v-container>

    <v-timeline :dense="$vuetify.breakpoint.smAndDown" class="margin-bottom">
    <v-timeline-item
      color="#0c494e"
      fill-dot
      left
    >
      <v-card md12 sm6>
        <v-card-title>
          
            
          <h2 class="display-1 black--text font-weight-light font-and-size">Background</h2>
        </v-card-title>
        <v-container>
          <v-row>
            <v-col cols="12" md="10">
              <p class="font-and-size">The yearly professional tennis calendar consists of <b class="font-colour">65</b> tournaments spanning <b class="font-colour">6 </b>continents and <b class="font-colour">35</b> weeks. Each week, for <b class="font-colour">35</b> weeks, there are either <b class="font-colour">1, 2 or 3</b> tournaments at various places around the globe. Each tournament has a different Prize Money and ATP Points allocation. The points available range from <b class="font-colour">250 to 2000</b> per tournament, and the Prize Money changes dependant on various criteria
                <v-btn
                color="#0c494e"
                
                pill
                >
                    <router-link to="/calendar" style="color:white" >Calendar</router-link>
                </v-btn>
              
              </p>
            </v-col>
            
        
          </v-row>
        </v-container>
        
      </v-card>
    </v-timeline-item>

    <v-timeline-item
      color="#0c494e"
      fill-dot
      right
    >
      <v-card >
        <v-card-title>
          
            
          <h2 class="display-1 black--text font-weight-light font-and-size">The Problem</h2>
        </v-card-title>
        <v-container>
          <v-row>
            <v-col cols="12" md="10">
              <p class="font-and-size">Due to the number of tournaments per week over the<b class="font-colour">35 weeks</b>, over <b class="font-colour">10 000 possible yearly schedules</b>  are created. Choosing the wrong schedule results in the potential loss of Prize Money and ATP Points. A badly planned schedule will also have the consequence of unnecessary and lengthly travel time and distance.
              <v-btn
                color="#0c494e"
                
                pill
                >
                    <router-link to="/about" style="color:white" >About</router-link>
                </v-btn>
              </p>
            </v-col>
            
          </v-row>
        </v-container>
      </v-card>
    </v-timeline-item>

    <v-timeline-item
      color="#0c494e"
      fill-dot
      left
    >
      <v-card >
        <v-card-title >
          
            
          <h2 class="display-1 black--text font-weight-light font-and-size">The Solution</h2>
        </v-card-title>
        <v-container>
          <v-row>
            <v-col cols="12" md="10">
            </v-col>
            <p class="font-and-size">An algorithm that will create the <b class="font-colour">perfect schedule.</b> It maximises points and prize money while minimising travel time and distance.
                <v-btn
                color="#0c494e"
                
                pill
                >
                    <router-link to="/schedule" style="color:white" >Schedule</router-link>
                </v-btn>
            </p>
            
          </v-row>
        </v-container>
      </v-card>
    </v-timeline-item>
    </v-timeline>

    <!-- <div class="row">
        <div class="col-4 d-flex justify-content-center">
            <img src="/Playicon.png" style="height:30%" >
        </div>
        <div class="col-4 d-flex justify-content-center">
            <img src="/travelicon.png"  style="height:30%">
        </div>
        <div class="col-4 d-flex justify-content-center">
            <img src="/winicon.png"  style="height:30%">
        </div>
    </div> -->

    <template>
    <v-container >
        <v-row>
      <v-col  sm="4">
        <v-img
          src="/play1.jpg" 
          contain
        style="height:60%"
          
        ></v-img>
      </v-col>

      <v-col  sm="4">
        <v-img src="/Travelicon1.jpg" 
        contain
        style="height:60%">
          
        </v-img>
      </v-col>

      <v-col  sm="4">
        <v-img src="/wintext1.jpg"  
        contain
        style="height:60%">
          
        </v-img>
      </v-col>
    </v-row>
    </v-container>
    </template>




    
    
        
            
        
            
        
    
    </v-main>
</template>


<script>

export default {
    data() {
    return {
        
        image : {backgroundImage: "https://images.pexels.com/photos/66323/tennis-ball-sport-yellow-66323.jpeg?cs=srgb&dl=yellow-sport-ball-tennis-66323.jpg&fm=jpg"},
        duration: 4,
        scaleClass: false
    };
  },
  methods: {
    theFormat(number) {
      return number.toFixed();
    },
    playAnimation() {
      console.log("Animation start!");
      this.scaleClass = false;
      this.$refs.number2.play();
    }
  },
  
}
</script>

<style>



.image {
        height: 150px;
        background-repeat: no-repeat;
    }

.center {
  display: block;
  margin-left: auto;
  margin-right: auto;
  margin-top: 75px;
  margin-bottom: 100px;
}

.colour{
    color: #0c494e;
}

.margin-left{
    margin-left: 110px;
}

.margin-bottom{
    margin-bottom: 100px;
}

.image-margin-left{
    margin-left: 200;
}

.font-and-size{
        font-family: 'Antic Didone';  
        font-size: 15px;
}

.font-colour{
    
    font-family: 'Antic Didone'; 
    color:#0c494e;
}






</style>