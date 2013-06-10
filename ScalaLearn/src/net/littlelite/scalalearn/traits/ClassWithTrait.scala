package net.littlelite.scalalearn.traits

object ClassWithTrait extends Speaking with Dancing {

    def test() {
        this.speak;
        this.dance;
    }
    
}