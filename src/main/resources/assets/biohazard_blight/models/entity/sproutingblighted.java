// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class sproutingblighted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "sproutingblighted"), "main");
	private final ModelPart bone;
	private final ModelPart bone16;
	private final ModelPart bone15;
	private final ModelPart bone23;
	private final ModelPart bone18;
	private final ModelPart bone13;
	private final ModelPart bone19;
	private final ModelPart bone20;
	private final ModelPart bone6;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart bone9;
	private final ModelPart bone10;
	private final ModelPart bone14;
	private final ModelPart bone22;
	private final ModelPart bone21;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone17;
	private final ModelPart bone5;
	private final ModelPart bone4;
	private final ModelPart bone11;
	private final ModelPart bone29;
	private final ModelPart bone30;
	private final ModelPart bone31;
	private final ModelPart bone32;
	private final ModelPart bone33;
	private final ModelPart bone12;
	private final ModelPart bone24;
	private final ModelPart bone25;
	private final ModelPart bone26;
	private final ModelPart bone27;
	private final ModelPart bone28;

	public sproutingblighted(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone16 = this.bone.getChild("bone16");
		this.bone15 = this.bone.getChild("bone15");
		this.bone23 = this.bone15.getChild("bone23");
		this.bone18 = this.bone.getChild("bone18");
		this.bone13 = this.bone.getChild("bone13");
		this.bone19 = this.bone13.getChild("bone19");
		this.bone20 = this.bone19.getChild("bone20");
		this.bone6 = this.bone.getChild("bone6");
		this.bone7 = this.bone6.getChild("bone7");
		this.bone8 = this.bone7.getChild("bone8");
		this.bone9 = this.bone8.getChild("bone9");
		this.bone10 = this.bone9.getChild("bone10");
		this.bone14 = this.bone.getChild("bone14");
		this.bone22 = this.bone14.getChild("bone22");
		this.bone21 = this.bone14.getChild("bone21");
		this.bone2 = this.bone.getChild("bone2");
		this.bone3 = this.bone.getChild("bone3");
		this.bone17 = this.bone.getChild("bone17");
		this.bone5 = this.bone.getChild("bone5");
		this.bone4 = this.bone.getChild("bone4");
		this.bone11 = this.bone.getChild("bone11");
		this.bone29 = this.bone11.getChild("bone29");
		this.bone30 = this.bone29.getChild("bone30");
		this.bone31 = this.bone30.getChild("bone31");
		this.bone32 = this.bone31.getChild("bone32");
		this.bone33 = this.bone32.getChild("bone33");
		this.bone12 = this.bone.getChild("bone12");
		this.bone24 = this.bone12.getChild("bone24");
		this.bone25 = this.bone24.getChild("bone25");
		this.bone26 = this.bone25.getChild("bone26");
		this.bone27 = this.bone26.getChild("bone27");
		this.bone28 = this.bone27.getChild("bone28");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.014F, 21.9328F, -0.5861F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(19, 19).addBox(-3.0F, -3.0F, -5.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.686F, 2.3672F, 0.9861F, 0.0363F, -0.2791F, -0.01F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(55, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.814F, 1.3672F, 0.5861F, -0.1681F, 0.3618F, -0.06F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(63, 37).addBox(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.314F, -0.6328F, -2.4139F, 0.175F, -0.0688F, -0.0121F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 19).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.014F, 2.0672F, 3.0861F, 0.0F, 0.1571F, 0.0F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 9).addBox(-3.0F, -3.0F, -5.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.014F, 2.0672F, 0.5861F, 0.035F, 0.0872F, 0.0031F));

		PartDefinition bone16 = bone.addOrReplaceChild("bone16", CubeListBuilder.create(), PartPose.offset(0.486F, -1.0328F, -2.8139F));

		PartDefinition cube_r6 = bone16.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(38, 9).addBox(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.1F, -1.6F, -0.1571F, -0.6458F, 0.0F));

		PartDefinition bone15 = bone.addOrReplaceChild("bone15", CubeListBuilder.create().texOffs(38, 16).addBox(-1.4465F, -1.3004F, -5.8352F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(58, 29).addBox(-0.4465F, -2.3004F, -5.8352F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.4325F, -1.6324F, 3.4213F));

		PartDefinition cube_r7 = bone15.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(36, 65).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0465F, 0.2996F, -1.2352F, -0.1047F, 0.0349F, 0.0F));

		PartDefinition cube_r8 = bone15.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(58, 57).addBox(0.0F, -3.0F, -1.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(42, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3465F, 1.1996F, 1.1648F, -0.3142F, 0.2618F, 0.0F));

		PartDefinition bone23 = bone15.addOrReplaceChild("bone23", CubeListBuilder.create(), PartPose.offset(0.9535F, 1.6996F, 3.8648F));

		PartDefinition cube_r9 = bone23.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(66, 0).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5585F, 0.9425F, 0.0F));

		PartDefinition bone18 = bone.addOrReplaceChild("bone18", CubeListBuilder.create(), PartPose.offset(-0.914F, 0.5672F, -0.3139F));

		PartDefinition cube_r10 = bone18.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(15, 42).addBox(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 0.0F, 0.2F, 3.019F, 1.3024F, 3.1359F));

		PartDefinition bone13 = bone.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offset(-0.314F, -3.0328F, -3.2139F));

		PartDefinition cube_r11 = bone13.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(51, 11).addBox(-2.0F, -5.0F, 1.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 1.8F, -4.0F, -0.5634F, 0.2227F, -0.044F));

		PartDefinition bone19 = bone13.addOrReplaceChild("bone19", CubeListBuilder.create(), PartPose.offset(-0.6F, -1.4F, -0.2F));

		PartDefinition cube_r12 = bone19.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 51).addBox(-2.0F, -5.0F, -1.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 2.8F, -4.1F, -0.7205F, 0.2227F, -0.044F));

		PartDefinition bone20 = bone19.addOrReplaceChild("bone20", CubeListBuilder.create(), PartPose.offset(0.0F, -0.7F, -2.7F));

		PartDefinition cube_r13 = bone20.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(53, 29).addBox(0.0F, -2.0F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.5F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r14 = bone20.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(63, 43).addBox(0.0F, -2.0F, -3.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -1.2F, -0.6545F, 0.0F, 0.0F));

		PartDefinition bone6 = bone.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(0.786F, 0.9672F, 6.8861F));

		PartDefinition cube_r15 = bone6.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(25, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.1F, -0.1F, 0.0F, 0.6458F, 0.0F));

		PartDefinition bone7 = bone6.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(3.2F, 0.0F, 4.0F));

		PartDefinition cube_r16 = bone7.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(52, 49).addBox(0.0F, -2.0F, -1.0F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(53, 21).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1F, 0.3F, 0.0F, 1.1868F, 0.0F));

		PartDefinition cube_r17 = bone7.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(36, 27).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(13, 49).addBox(-1.0F, -1.5F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.6F, -0.3F, 0.0F, 1.1868F, 0.0F));

		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(3.7F, 0.0F, 1.4F));

		PartDefinition cube_r18 = bone8.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(21, 9).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 1.1F, 0.1F, 0.0F, 1.9373F, 0.0F));

		PartDefinition bone9 = bone8.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(5.7F, 0.0F, -1.8F));

		PartDefinition cube_r19 = bone9.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(18, 65).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 1.1F, -0.6F, 0.0F, 2.5307F, 0.0F));

		PartDefinition bone10 = bone9.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(0.9F, 0.0F, -0.7F));

		PartDefinition cube_r20 = bone10.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.0F, -2.9F, 3.107F, -0.2966F, -3.0262F));

		PartDefinition cube_r21 = bone10.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(26, 49).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -1.1F, 0.0F, 2.7576F, 0.0F));

		PartDefinition bone14 = bone.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offset(-0.414F, -0.4328F, -3.2139F));

		PartDefinition cube_r22 = bone14.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(19, 27).addBox(-3.0F, -2.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.4F, -0.7F, 0.3492F, 0.3129F, 0.1116F));

		PartDefinition bone22 = bone14.addOrReplaceChild("bone22", CubeListBuilder.create(), PartPose.offset(-0.3F, 1.4F, -3.4F));

		PartDefinition cube_r23 = bone22.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(72, 43).addBox(0.0F, -2.0F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, -4.7F, -0.8372F, 0.1326F, -0.0682F));

		PartDefinition cube_r24 = bone22.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(63, 50).addBox(0.0F, -2.0F, -3.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.5F, -0.9F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bone21 = bone14.addOrReplaceChild("bone21", CubeListBuilder.create(), PartPose.offset(-2.6F, 0.6F, -2.8F));

		PartDefinition cube_r25 = bone21.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(61, 70).addBox(0.0F, -2.0F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6F, -0.7F, -3.9F, -0.7736F, 0.2519F, 0.0493F));

		PartDefinition cube_r26 = bone21.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(64, 21).addBox(0.0F, -2.0F, -3.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 1.1F, -0.6F, -0.4209F, 0.6744F, -0.1874F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.986F, 1.8672F, -0.7139F));

		PartDefinition cube_r27 = bone2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(15, 34).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0871F, 0.3661F, -0.056F));

		PartDefinition bone3 = bone.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-3.214F, 2.0672F, -0.2139F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 28).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0244F, -0.4357F, 0.0578F));

		PartDefinition bone17 = bone.addOrReplaceChild("bone17", CubeListBuilder.create(), PartPose.offset(-4.014F, 2.5672F, -2.1139F));

		PartDefinition cube_r29 = bone17.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(28, 42).addBox(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1947F, 1.1484F, -0.1146F));

		PartDefinition bone5 = bone.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(1.486F, 2.0672F, 5.7861F));

		PartDefinition cube_r30 = bone5.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(30, 34).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0229F, 0.8372F, -0.0671F));

		PartDefinition bone4 = bone.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-0.514F, 2.0672F, 6.1861F));

		PartDefinition cube_r31 = bone4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 36).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.0F, 0.4F, -0.0163F, -0.3494F, -0.0445F));

		PartDefinition bone11 = bone.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offset(-0.114F, -2.3328F, 1.7861F));

		PartDefinition cube_r32 = bone11.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(58, 65).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 0.4F, 0.5237F, -0.4367F, -0.356F));

		PartDefinition bone29 = bone11.addOrReplaceChild("bone29", CubeListBuilder.create(), PartPose.offset(-1.0F, -0.9F, 2.3F));

		PartDefinition cube_r33 = bone29.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(31, 56).addBox(0.0F, -3.0F, -1.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(41, 42).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.1F, -0.5F, 0.2967F, -1.1694F, 0.0F));

		PartDefinition bone30 = bone29.addOrReplaceChild("bone30", CubeListBuilder.create(), PartPose.offset(-3.8F, -0.4F, 0.4F));

		PartDefinition cube_r34 = bone30.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(66, 5).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.3F, 0.2F, 2.6933F, -0.9352F, -2.7441F));

		PartDefinition bone31 = bone30.addOrReplaceChild("bone31", CubeListBuilder.create(), PartPose.offset(-1.9F, 0.8F, -1.3F));

		PartDefinition cube_r35 = bone31.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(40, 56).addBox(0.0F, -3.0F, -1.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 44).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.7F, 0.2F, 2.6518F, -0.7309F, -3.0313F));

		PartDefinition bone32 = bone31.addOrReplaceChild("bone32", CubeListBuilder.create(), PartPose.offset(-2.4F, 0.5F, -1.9F));

		PartDefinition cube_r36 = bone32.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(27, 65).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.0F, 0.4F, 1.9602F, -0.9352F, -2.7441F));

		PartDefinition bone33 = bone32.addOrReplaceChild("bone33", CubeListBuilder.create(), PartPose.offset(-0.5F, 2.0F, -0.7F));

		PartDefinition cube_r37 = bone33.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(23, 70).addBox(0.0F, -1.0F, -3.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.7F, 1.2F, 1.2395F, 1.1773F, 0.4948F));

		PartDefinition cube_r38 = bone33.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(67, 57).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, 1.7F, 1.1F, 1.0301F, 1.1773F, 0.4948F));

		PartDefinition cube_r39 = bone33.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(30, 70).addBox(0.0F, -1.0F, -3.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 1.7F, 0.3F, 0.8552F, 0.4363F, 0.0F));

		PartDefinition cube_r40 = bone33.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(67, 69).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, 1.7F, 0.0F, 0.6283F, 0.4363F, 0.0F));

		PartDefinition cube_r41 = bone33.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(37, 70).addBox(0.0F, -1.0F, -3.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.6F, -0.5F, 0.7505F, -0.3665F, 0.0F));

		PartDefinition cube_r42 = bone33.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(67, 32).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 1.6F, -0.7F, 0.6109F, -0.3665F, 0.0F));

		PartDefinition cube_r43 = bone33.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(64, 11).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.1F, 1.0F, 1.4824F, -0.7309F, -3.0313F));

		PartDefinition cube_r44 = bone33.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(67, 65).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.1F, 1.0F, 1.1508F, -0.7309F, -3.0313F));

		PartDefinition bone12 = bone.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offset(-0.114F, -2.7328F, 1.9861F));

		PartDefinition cube_r45 = bone12.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 66).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.9F, -0.2F, 0.5385F, 0.4872F, 0.1563F));

		PartDefinition bone24 = bone12.addOrReplaceChild("bone24", CubeListBuilder.create(), PartPose.offset(1.5F, 0.0F, 1.1F));

		PartDefinition cube_r46 = bone24.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 57).addBox(0.0F, -3.0F, -1.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(45, 33).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8F, -0.1F, 0.5F, 2.6157F, -1.3908F, -2.8908F));

		PartDefinition bone25 = bone24.addOrReplaceChild("bone25", CubeListBuilder.create(), PartPose.offset(2.9F, -0.9F, 0.6F));

		PartDefinition cube_r47 = bone25.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(66, 16).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.2F, 1.3F, 2.6933F, -0.9352F, -2.7441F));

		PartDefinition bone26 = bone25.addOrReplaceChild("bone26", CubeListBuilder.create(), PartPose.offset(2.9F, -0.5F, 1.1F));

		PartDefinition cube_r48 = bone26.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(49, 57).addBox(0.0F, -3.0F, -1.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(39, 49).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.1F, 0.4F, 2.0471F, 0.8496F, 2.2718F));

		PartDefinition bone27 = bone26.addOrReplaceChild("bone27", CubeListBuilder.create(), PartPose.offset(2.9F, 1.8F, -0.7F));

		PartDefinition cube_r49 = bone27.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(45, 66).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 1.3F, 0.9F, -2.3067F, -1.2234F, -3.0602F));

		PartDefinition bone28 = bone27.addOrReplaceChild("bone28", CubeListBuilder.create(), PartPose.offset(0.7F, 2.1F, 0.0F));

		PartDefinition cube_r50 = bone28.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 71).addBox(0.0F, -1.0F, -3.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 1.5F, 0.0F, 0.7505F, -0.3665F, 0.0F));

		PartDefinition cube_r51 = bone28.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(67, 61).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, 1.5F, -0.2F, 0.6109F, -0.3665F, 0.0F));

		PartDefinition cube_r52 = bone28.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(54, 70).addBox(0.0F, -1.0F, -3.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 1.6F, 1.7F, 1.2395F, 1.1773F, 0.4948F));

		PartDefinition cube_r53 = bone28.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(67, 28).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 1.6F, 1.6F, 1.0301F, 1.1773F, 0.4948F));

		PartDefinition cube_r54 = bone28.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(44, 71).addBox(0.0F, -1.0F, -3.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.6F, 0.8F, 0.8552F, 0.4363F, 0.0F));

		PartDefinition cube_r55 = bone28.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(16, 70).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 1.6F, 0.5F, 0.6283F, 0.4363F, 0.0F));

		PartDefinition cube_r56 = bone28.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(9, 65).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 1.0F, 1.5F, 1.4824F, -0.7309F, -3.0313F));

		PartDefinition cube_r57 = bone28.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(9, 70).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.0F, 1.5F, 1.1508F, -0.7309F, -3.0313F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}