package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.cinematic.MotionPath;
import com.jme3.cinematic.events.MotionEvent;
import com.jme3.font.BitmapText;
import com.jme3.input.KeyInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.light.DirectionalLight;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.renderer.queue.RenderQueue;
import com.jme3.scene.Geometry;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;

/**
 * Kyle Johnson and Christopher McCormick
 */

public class Main extends SimpleApplication {
    
    private MotionPath path1;
    private MotionPath path2;
    private MotionEvent motionControl1;
    private MotionEvent motionControl2;
    private boolean playing = false;
    private boolean door1Open = false;

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        
        //set up materials
        Material ssu = new Material(assetManager, "Common/MatDefs/Light/Lighting.j3md");
        ssu.setTexture("DiffuseMap", assetManager.loadTexture("Textures/ssu.png"));
        Material ssu2 = new Material(assetManager, "Common/MatDefs/Light/Lighting.j3md");
        ssu2.setTexture("DiffuseMap", assetManager.loadTexture("Textures/ssu2.jpg"));
        
        //create Box
        Box b = new Box(1, 1, 1);
        Spatial geom = new Geometry("Box", b);
        geom.setMaterial(ssu2);
        geom.setLocalTranslation(-2.0f, 0.0f, 0.0f);
        rootNode.attachChild(geom);
        
        //create the floor
        Geometry floor = new Geometry("floor", new Box(5.0f, 0.01f, 5.0f));
        floor.setShadowMode(RenderQueue.ShadowMode.Receive);
        floor.setLocalTranslation(0.0f, -3.0f, 0.0f);
        floor.setMaterial(ssu);
        rootNode.attachChild(floor);
        
        // create light
        DirectionalLight sun = new DirectionalLight();
        sun.setDirection((new Vector3f(-0.7f, -0.3f, -0.5f)).normalizeLocal());
        System.out.println("Here We Go: " + sun.getDirection());
        sun.setColor(ColorRGBA.White);
        rootNode.addLight(sun);

        
        //-----------------------------------------------------------//

        
        //HUD - Basic Text explaining operation
        BitmapText hudText01 = new BitmapText (guiFont, false);
        hudText01.setSize(guiFont.getCharSet().getRenderedSize());
        hudText01.setColor(ColorRGBA.White);
        hudText01.setText("Injection Molding Machine\nPress the 'O' Key to operate the door.");
        hudText01.setLocalTranslation(300, hudText01.getLineHeight() * 4, 0);
        guiNode.attachChild(hudText01);
        
        
        //-----------------------------------------------------------//
        
        
        //DOOR OPEN
        path1 = new MotionPath();
        path1.addWayPoint(new Vector3f(-2, 0, 0));
        path1.addWayPoint(new Vector3f(2, 0, 0));
        //path1.enableDebugShape(assetManager, rootNode);
        
        motionControl1 = new MotionEvent(geom,path1);
        motionControl1.setDirectionType(MotionEvent.Direction.PathAndRotation);
        motionControl1.setInitialDuration(10f);
        motionControl1.setSpeed(8f); 
        
        //DOOR Close
        path2 = new MotionPath();
        path2.addWayPoint(new Vector3f(2, 0, 0));
        path2.addWayPoint(new Vector3f(-2, 0, 0));
        
        motionControl2 = new MotionEvent(geom,path2);
        motionControl2.setDirectionType(MotionEvent.Direction.PathAndRotation);
        motionControl2.setInitialDuration(10f);
        motionControl2.setSpeed(8f); 
                
        //set up the input commands
        initInputs();
    }

    private void initInputs() {
        
        inputManager.addMapping("door1", new KeyTrigger(KeyInput.KEY_O));
             
        ActionListener acl = new ActionListener() {

            public void onAction(String name, boolean keyPressed, float tpf) {
                
                if (name.equals("door1") && keyPressed) {
                    if (!door1Open) 
                    {
                        door1Open = true;
                        motionControl1.play();
                    } 
                    else 
                    {
                        door1Open = false;
                        motionControl2.play();
                    }
                }
            }
        };

        inputManager.addListener(acl, "door1");
        
    }
    
    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
