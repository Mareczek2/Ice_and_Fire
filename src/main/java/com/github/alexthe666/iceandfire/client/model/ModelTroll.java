package com.github.alexthe666.iceandfire.client.model;

import com.github.alexthe666.iceandfire.entity.EntityCyclops;
import com.github.alexthe666.iceandfire.entity.EntityGorgon;
import com.github.alexthe666.iceandfire.entity.EntityTroll;
import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.entity.Entity;

public class ModelTroll extends ModelDragonBase {
    public AdvancedModelRenderer body;
    public AdvancedModelRenderer upperBody;
    public AdvancedModelRenderer loin;
    public AdvancedModelRenderer rightleg;
    public AdvancedModelRenderer leftleg;
    public AdvancedModelRenderer head;
    public AdvancedModelRenderer rightarm;
    public AdvancedModelRenderer leftarm;
    public AdvancedModelRenderer chest;
    public AdvancedModelRenderer jaw;
    public AdvancedModelRenderer mouth;
    public AdvancedModelRenderer nose;
    public AdvancedModelRenderer teeth;
    public AdvancedModelRenderer hornL;
    public AdvancedModelRenderer hornR;
    public AdvancedModelRenderer hornL2;
    public AdvancedModelRenderer hornR2;
    public AdvancedModelRenderer nose2;
    public AdvancedModelRenderer rightarm2;
    public AdvancedModelRenderer log1;
    public AdvancedModelRenderer log2;
    public AdvancedModelRenderer handle;
    public AdvancedModelRenderer column;
    public AdvancedModelRenderer blade1;
    public AdvancedModelRenderer blade2;
    public AdvancedModelRenderer blade2_1;
    public AdvancedModelRenderer block;
    public AdvancedModelRenderer blade2_2;
    public AdvancedModelRenderer bottom;
    public AdvancedModelRenderer top;
    public AdvancedModelRenderer leftarm2;
    public AdvancedModelRenderer rightleg2;
    public AdvancedModelRenderer leftleg2;
    private ModelAnimator animator;

    public ModelTroll() {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.log2 = new AdvancedModelRenderer(this, 10, 70);
        this.log2.setRotationPoint(0.0F, 9.0F, -1.0F);
        this.log2.addBox(-2.0F, -6.9F, -3.0F, 7, 24, 6, 0.0F);
        this.setRotateAngle(log2, -0.045553093477052F, 0.0F, 0.0F);
        this.top = new AdvancedModelRenderer(this, 177, 0);
        this.top.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.top.addBox(-1.5F, 20.0F, -3.5F, 10, 4, 10, 0.0F);
        this.hornL = new AdvancedModelRenderer(this, 60, 101);
        this.hornL.mirror = true;
        this.hornL.setRotationPoint(1.3F, -1.5F, -1.0F);
        this.hornL.addBox(-1.5F, -0.5F, 0.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(hornL, -0.5918411493512771F, 2.6406831582674206F, -0.17453292519943295F);
        this.body = new AdvancedModelRenderer(this, 88, 46);
        this.body.setRotationPoint(0.0F, -2.4F, 0.0F);
        this.body.addBox(-5.0F, -7.0F, -3.0F, 10, 9, 8, 0.0F);
        this.leftleg2 = new AdvancedModelRenderer(this, 0, 15);
        this.leftleg2.mirror = true;
        this.leftleg2.setRotationPoint(0.0F, 9.6F, -0.2F);
        this.leftleg2.addBox(-3.0F, 1.0F, -2.0F, 6, 15, 6, 0.0F);
        this.setRotateAngle(leftleg2, 0.3490658503988659F, 0.0F, 0.08726646259971647F);
        this.head = new AdvancedModelRenderer(this, 90, 0);
        this.head.setRotationPoint(0.0F, -15.8F, -1.0F);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 10, 8, 0.0F);
        this.setRotateAngle(head, -0.18203784098300857F, 0.0F, 0.0F);
        this.blade1 = new AdvancedModelRenderer(this, 186, 84);
        this.blade1.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.blade1.addBox(-1.0F, 12.0F, 0.0F, 2, 10, 10, 0.0F);
        this.hornR = new AdvancedModelRenderer(this, 60, 101);
        this.hornR.mirror = true;
        this.hornR.setRotationPoint(-1.3F, -1.5F, -1.0F);
        this.hornR.addBox(-0.5F, -0.5F, 0.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(hornR, -0.7740535232594852F, -2.9595548126067843F, 0.27314402793711257F);
        this.log1 = new AdvancedModelRenderer(this, 10, 100);
        this.log1.setRotationPoint(-0.5F, 8.0F, -0.4F);
        this.log1.addBox(-1.5F, -17.9F, -3.5F, 6, 20, 6, 0.0F);
        this.setRotateAngle(log1, -1.593485607070823F, 0.0F, 0.0F);
        this.bottom = new AdvancedModelRenderer(this, 177, 0);
        this.bottom.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.bottom.addBox(-1.5F, -21.0F, -3.5F, 10, 4, 10, 0.0F);
        this.nose2 = new AdvancedModelRenderer(this, 114, 120);
        this.nose2.setRotationPoint(0.0F, 5.1F, -3.0F);
        this.nose2.addBox(-1.5F, -1.8F, -1.6F, 3, 4, 2, 0.0F);
        this.setRotateAngle(nose2, -1.2747884856566583F, 0.0F, 0.0F);
        this.blade2_1 = new AdvancedModelRenderer(this, 189, 69);
        this.blade2_1.setRotationPoint(0.0F, 2.0F, -1.0F);
        this.blade2_1.addBox(-1.0F, 2.0F, -1.0F, 2, 2, 6, 0.0F);
        this.hornR2 = new AdvancedModelRenderer(this, 46, 90);
        this.hornR2.mirror = true;
        this.hornR2.setRotationPoint(-0.5F, 1.3F, 6.6F);
        this.hornR2.addBox(-0.01F, -0.8F, -0.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(hornR2, 1.2747884856566583F, 0.0F, 0.0F);
        this.leftleg = new AdvancedModelRenderer(this, 0, 45);
        this.leftleg.mirror = true;
        this.leftleg.setRotationPoint(4.0F, 1.2F, 1.0F);
        this.leftleg.addBox(-3.0F, 1.0F, -2.0F, 6, 13, 6, 0.0F);
        this.setRotateAngle(leftleg, -0.2617993877991494F, 0.0F, -0.08726646259971647F);
        this.upperBody = new AdvancedModelRenderer(this, 85, 21);
        this.upperBody.setRotationPoint(0.0F, -6.0F, 1.3F);
        this.upperBody.addBox(-6.0F, -13.9F, -4.1F, 12, 14, 9, 0.0F);
        this.setRotateAngle(upperBody, 0.31869712141416456F, 0.0F, 0.0F);
        this.rightleg2 = new AdvancedModelRenderer(this, 0, 15);
        this.rightleg2.setRotationPoint(0.0F, 9.6F, -0.2F);
        this.rightleg2.addBox(-3.0F, 1.0F, -2.0F, 6, 15, 6, 0.0F);
        this.setRotateAngle(rightleg2, 0.3490658503988659F, 0.0F, -0.08726646259971647F);
        this.leftarm = new AdvancedModelRenderer(this, 64, 0);
        this.leftarm.mirror = true;
        this.leftarm.setRotationPoint(5.0F, -11.2F, -0.4F);
        this.leftarm.addBox(0.0F, -2.0F, -2.0F, 6, 13, 7, 0.0F);
        this.setRotateAngle(leftarm, -0.136659280431156F, 0.0F, -0.17453292519943295F);
        this.mouth = new AdvancedModelRenderer(this, 114, 0);
        this.mouth.setRotationPoint(0.0F, 0.3F, -1.0F);
        this.mouth.addBox(-2.5F, -0.6F, -4.6F, 5, 3, 2, 0.0F);
        this.setRotateAngle(mouth, -0.18203784098300857F, 0.0F, 0.0F);
        this.jaw = new AdvancedModelRenderer(this, 40, 11);
        this.jaw.setRotationPoint(0.0F, 2.3F, -2.0F);
        this.jaw.addBox(-2.0F, -0.6F, -4.6F, 4, 2, 6, 0.0F);
        this.setRotateAngle(jaw, -0.091106186954104F, 0.0F, 0.0F);
        this.hornL2 = new AdvancedModelRenderer(this, 46, 90);
        this.hornL2.mirror = true;
        this.hornL2.setRotationPoint(-0.5F, 1.3F, 6.6F);
        this.hornL2.addBox(-1.01F, -0.8F, -0.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(hornL2, 1.4114477660878142F, 0.0F, 0.0F);
        this.rightleg = new AdvancedModelRenderer(this, 0, 45);
        this.rightleg.setRotationPoint(-4.0F, 1.2F, 1.0F);
        this.rightleg.addBox(-3.0F, 1.0F, -2.0F, 6, 13, 6, 0.0F);
        this.setRotateAngle(rightleg, -0.2617993877991494F, 0.0F, 0.08726646259971647F);
        this.column = new AdvancedModelRenderer(this, 220, 28);
        this.column.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.column.addBox(-1.5F, -20.0F, -2.5F, 8, 42, 8, 0.0F);
        this.setRotateAngle(column, -0.045553093477052F, 0.0F, 0.0F);
        this.leftarm2 = new AdvancedModelRenderer(this, 60, 24);
        this.leftarm2.mirror = true;
        this.leftarm2.setRotationPoint(2.1F, 10.0F, -0.1F);
        this.leftarm2.addBox(-2.0F, -5.0F, -1.7F, 5, 16, 7, 0.0F);
        this.setRotateAngle(leftarm2, -0.31869712141416456F, 0.0F, 0.0F);
        this.rightarm = new AdvancedModelRenderer(this, 64, 0);
        this.rightarm.setRotationPoint(-5.0F, -11.2F, -0.4F);
        this.rightarm.addBox(-6.0F, -2.0F, -2.0F, 6, 13, 7, 0.0F);
        this.setRotateAngle(rightarm, -0.045553093477052F, 0.27314402793711257F, 0.0F);
        this.handle = new AdvancedModelRenderer(this, 232, 80);
        this.handle.setRotationPoint(0.3F, 0.0F, 1.0F);
        this.handle.addBox(-1.5F, -20.0F, -1.5F, 3, 42, 3, 0.0F);
        this.setRotateAngle(handle, -0.045553093477052F, 0.0F, 0.0F);
        this.block = new AdvancedModelRenderer(this, 182, 19);
        this.block.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.block.addBox(-2.0F, 11.0F, -8.0F, 4, 10, 15, 0.0F);
        this.blade2_2 = new AdvancedModelRenderer(this, 161, 99);
        this.blade2_2.setRotationPoint(0.0F, 17.0F, 9.0F);
        this.blade2_2.addBox(-1.0F, -5.0F, -6.0F, 2, 5, 5, 0.0F);
        this.setRotateAngle(blade2_2, 3.141592653589793F, 0.0F, 0.0F);
        this.loin = new AdvancedModelRenderer(this, 50, 56);
        this.loin.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.loin.addBox(-5.5F, 0.0F, -3.5F, 11, 13, 9, 0.0F);
        this.nose = new AdvancedModelRenderer(this, 114, 100);
        this.nose.setRotationPoint(0.0F, -4.5F, -0.2F);
        this.nose.addBox(-1.0F, -0.6F, -4.6F, 2, 5, 2, 0.0F);
        this.setRotateAngle(nose, -0.5462880558742251F, 0.0F, 0.0F);
        this.teeth = new AdvancedModelRenderer(this, 39, 0);
        this.teeth.setRotationPoint(0.0F, 2.0F, -1.0F);
        this.teeth.addBox(-2.1F, -3.6F, -3.6F, 4, 2, 6, 0.0F);
        this.chest = new AdvancedModelRenderer(this, 93, 29);
        this.chest.setRotationPoint(0.0F, -8.9F, 0.5F);
        this.chest.addBox(-5.0F, -2.0F, -4.8F, 10, 6, 2, 0.0F);
        this.setRotateAngle(chest, -0.22759093446006054F, 0.0F, 0.0F);
        this.blade2 = new AdvancedModelRenderer(this, 186, 66);
        this.blade2.setRotationPoint(0.0F, 7.0F, -1.0F);
        this.blade2.addBox(-1.0F, 1.0F, -1.0F, 2, 2, 9, 0.0F);
        this.rightarm2 = new AdvancedModelRenderer(this, 60, 24);
        this.rightarm2.setRotationPoint(-2.1F, 10.0F, 0.1F);
        this.rightarm2.addBox(-3.0F, -5.0F, -1.7F, 5, 16, 7, 0.0F);
        this.setRotateAngle(rightarm2, -2.1399481958702475F, 0.22759093446006054F, -0.136659280431156F);
        this.log1.addChild(this.log2);
        this.column.addChild(this.top);
        this.jaw.addChild(this.hornL);
        this.leftleg.addChild(this.leftleg2);
        this.upperBody.addChild(this.head);
        this.handle.addChild(this.blade1);
        this.jaw.addChild(this.hornR);
        this.rightarm2.addChild(this.log1);
        this.column.addChild(this.bottom);
        this.nose.addChild(this.nose2);
        this.handle.addChild(this.blade2_1);
        this.hornR.addChild(this.hornR2);
        this.body.addChild(this.leftleg);
        this.body.addChild(this.upperBody);
        this.rightleg.addChild(this.rightleg2);
        this.upperBody.addChild(this.leftarm);
        this.head.addChild(this.mouth);
        this.head.addChild(this.jaw);
        this.hornL.addChild(this.hornL2);
        this.body.addChild(this.rightleg);
        this.log1.addChild(this.column);
        this.leftarm.addChild(this.leftarm2);
        this.upperBody.addChild(this.rightarm);
        this.log1.addChild(this.handle);
        this.handle.addChild(this.block);
        this.blade1.addChild(this.blade2_2);
        this.body.addChild(this.loin);
        this.head.addChild(this.nose);
        this.jaw.addChild(this.teeth);
        this.upperBody.addChild(this.chest);
        this.handle.addChild(this.blade2);
        this.rightarm.addChild(this.rightarm2);
        animator = ModelAnimator.create();
        this.updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        if(entity instanceof EntityTroll && EntityGorgon.isStoneMob((EntityTroll)entity)){
            animateStatue((EntityTroll)entity);
            this.log1.showModel = false;
        }else{
            animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
            this.log1.showModel = true;
        }
        this.body.render(f5);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (EntityTroll) entity);
        animator.update(entity);
        animator.setAnimation(EntityTroll.ANIMATION_STRIKE_HORIZONTAL);
        animator.startKeyframe(10);
        this.rotate(animator, body, 0, 31, 0);
        this.rotate(animator, upperBody, 18, 39, 0);
        this.rotate(animator, leftarm, 18, 0, -10);
        this.rotate(animator, rightarm, 41, 57, 65);
        this.rotate(animator, rightarm2, 50, 0, 0);
        this.rotate(animator, rightleg, -15, 57, 5);
        this.rotate(animator, leftleg, -13, -44, -5);
        animator.move(body , 0, 3, 0);
        animator.endKeyframe();
        animator.startKeyframe(5);
        this.rotate(animator, body, 0, 31, 0);
        this.rotate(animator, upperBody, 18, -39, 0);
        this.rotate(animator, leftarm, 18, 0, -10);
        this.rotate(animator, rightarm, -60, -40, -35);
        this.rotate(animator, rightarm2, 80, -45, 40);
        this.rotate(animator, rightleg, -15, 57, 5);
        this.rotate(animator, leftleg, -13, -44, -5);
        this.rotate(animator, log1, 15, 0, 0);
        animator.move(body , 0, 3, 0);
        animator.endKeyframe();
        animator.resetKeyframe(5);

        animator.setAnimation(EntityTroll.ANIMATION_STRIKE_VERTICAL);
        animator.startKeyframe(7);
        this.rotate(animator, upperBody, -30, 0, 0);
        this.rotate(animator, rightleg, -15, 57, 5);
        this.rotate(animator, leftleg, -13, -44, -5);
        this.rotate(animator, leftarm, -203, 35, -15);
        this.rotate(animator, rightarm, -212, -40, 25);
        this.rotate(animator, leftarm2, 18, 0, 0);
        this.rotate(animator, rightarm2, 122, -13, 7);
        this.rotate(animator, log1, 0, -40, 0);
        animator.move(body, 0, 3, 0);
        animator.move(log1, 5, 0, 0);
        animator.endKeyframe();
        animator.startKeyframe(5);
        this.rotate(animator, body, 5, 0, 0);
        this.rotate(animator, upperBody, 35, 0, 0);
        this.rotate(animator, rightleg, -15, 57, 5);
        this.rotate(animator, leftleg, -13, -44, -5);
        this.rotate(animator, leftarm, -103, 20, -15);
        this.rotate(animator, rightarm, -112, -20, 25);
        this.rotate(animator, leftarm2, 18, 0, 0);
        this.rotate(animator, rightarm2, 122, -13, 7);
        this.rotate(animator, log1, 90, 25, 20);
        animator.move(body, 0, 3, 0);
        animator.move(log1, 2, 0, 0);
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(5);

        animator.setAnimation(EntityTroll.ANIMATION_SPEAK);
        animator.startKeyframe(5);
        this.rotate(animator, jaw, 20, 0, 0);
        animator.resetKeyframe(5);

    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, EntityTroll entity) {
        this.progressRotation(head, entity.stoneProgress, (float)Math.toRadians(-31), 0.0F, 0.0F);
        this.progressRotation(jaw, entity.stoneProgress, (float)Math.toRadians(54), 0.0F, 0.0F);
        this.progressRotation(leftarm, entity.stoneProgress, (float)Math.toRadians(10), (float)Math.toRadians(-73), (float)Math.toRadians(-60));
        this.progressRotation(leftarm2, entity.stoneProgress, (float)Math.toRadians(-80), 0.0F, 0.0F);
        this.progressRotation(rightarm, entity.stoneProgress, (float)Math.toRadians(-101), (float)Math.toRadians(70), 0);
        this.progressRotation(rightarm2, entity.stoneProgress, (float)Math.toRadians(-40), 0.0F, 0.0F);

        float speed_walk = 0.2F;
        float speed_idle = 0.05F;
        float degree_walk = 0.75F;
        float degree_idle = 0.5F;
        this.walk(this.rightleg, speed_walk, degree_walk * -0.75F, true, 0, 0F, f, f1);
        this.walk(this.leftleg, speed_walk, degree_walk * -0.75F, false, 0, 0F, f, f1);
        this.walk(this.rightleg2, speed_walk, degree_walk * -0.5F, true, 1, -0.3F, f, f1);
        this.walk(this.leftleg2, speed_walk, degree_walk * -0.5F, false, 1, 0.3F, f, f1);
        this.walk(this.leftarm, speed_walk, degree_walk * -0.75F, true, 0, 0F, f, f1);
        this.walk(this.leftarm2, speed_walk, degree_walk * -0.5F, true, 1, 0.3F, f, f1);
        this.swing(this.body, speed_walk, degree_walk * -0.5F, false, 0, 0F, f, f1);
        this.swing(this.upperBody, speed_walk, degree_walk * -0.25F, true, 0, 0F, f, f1);
        this.walk(this.rightarm, speed_walk, degree_walk * -0.25F, false, 0, 0F, f, f1);
        this.walk(this.rightarm2, speed_walk, degree_walk * -0.125F, false, 1, -0.3F, f, f1);
        this.walk(this.body, speed_idle, degree_idle * -0.1F, true, 0F, -0.1F, entity.ticksExisted, 1);
        this.walk(this.rightleg, speed_idle, degree_idle * 0.1F, true, 0F, 0.1F, entity.ticksExisted, 1);
        this.walk(this.leftleg, speed_idle, degree_idle * 0.1F, true, 0F, 0.1F, entity.ticksExisted, 1);

        this.flap(this.leftarm, speed_idle, degree_idle * -0.1F, true, 0, 0F, entity.ticksExisted, 1);
        this.flap(this.rightarm, speed_idle, degree_idle * -0.1F, false, 0, 0F, entity.ticksExisted, 1);
        this.flap(this.leftarm2, speed_idle, degree_idle * -0.1F, true, 0, -0.1F, entity.ticksExisted, 1);
        this.flap(this.rightarm2, speed_idle, degree_idle * -0.1F, false, 0, -0.1F, entity.ticksExisted, 1);
        this.walk(this.jaw, speed_idle, degree_idle * -0.15F, true, 0F, -0.1F, entity.ticksExisted, 1);
        this.walk(this.mouth, speed_idle, degree_idle * -0.15F, false, 0F, -0.1F, entity.ticksExisted, 1);
        this.faceTarget(f3, f4, 1, this.head);

    }

    public void animateStatue(EntityTroll troll) {
        this.resetToDefaultPose();
        this.progressRotation(head, troll.stoneProgress, (float)Math.toRadians(-31), 0.0F, 0.0F);
        this.progressRotation(jaw, troll.stoneProgress, (float)Math.toRadians(54), 0.0F, 0.0F);
        this.progressRotation(leftarm, troll.stoneProgress, (float)Math.toRadians(10), (float)Math.toRadians(-73), (float)Math.toRadians(-60));
        this.progressRotation(leftarm2, troll.stoneProgress, (float)Math.toRadians(-80), 0.0F, 0.0F);
        this.progressRotation(rightarm, troll.stoneProgress, (float)Math.toRadians(-101), (float)Math.toRadians(70), 0);
        this.progressRotation(rightarm2, troll.stoneProgress, (float)Math.toRadians(-40), 0.0F, 0.0F);
    }

    @Override
    public void renderStatue() {
        this.resetToDefaultPose();
        this.body.render(0.0625F);
    }
}