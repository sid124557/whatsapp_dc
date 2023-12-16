package X;

import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.5MH  reason: invalid class name */
public class AnonymousClass5MH {
    public AnonymousClass5Y1 A00;

    public C195639Yw A00() {
        long j;
        AnonymousClass5Y1 r0 = this.A00;
        if (r0.A0B == null) {
            synchronized (r0) {
                if (r0.A0B == null) {
                    new C105455Uz();
                    File A01 = new C126266Ne(r0.A08.A00).A01();
                    C201599kP r6 = new C201599kP(AnonymousClass002.A0A(A01, "tmp_extract"));
                    AnonymousClass4Zk r12 = r0.A07;
                    C160037mv r14 = new C160037mv(r12, r0.A09);
                    long j2 = 100 << 20;
                    C195529Yg r5 = new C195529Yg((C202279lh) new C118015sr(r14, 106, 100, j2).get());
                    C160037mv r21 = r14;
                    C195529Yg r4 = new C195529Yg((C202279lh) new C118015sr(r21, 109, 1, 1 << 20).get());
                    HashMap A0t = AnonymousClass001.A0t();
                    VersionedCapability versionedCapability = VersionedCapability.Facetracker;
                    AnonymousClass0x2.A1J(versionedCapability, A0t, 25);
                    C1001959y r2 = new C1001959y();
                    HashMap A0t2 = AnonymousClass001.A0t();
                    if (A0t.get(versionedCapability) == null) {
                        j = 100;
                    } else {
                        j = ((Long) C18320x8.A0Z(A0t, versionedCapability)).longValue();
                    }
                    C202279lh r7 = (C202279lh) new C118015sr(r21, 107, j, j << 20).get();
                    A0t2.put(versionedCapability, new C1903495k(versionedCapability, new C195529Yg(r7), r2, new C201589kO(r7)));
                    C202279lh r72 = (C202279lh) new C118015sr(r14, C627136h.A03, 100, j2).get();
                    C195529Yg r9 = new C195529Yg(r72);
                    C129586aY r8 = (C129586aY) C18300x5.A0d(C100845Cm.A00);
                    C1903595l r73 = new C1903595l(r9, r8, r2, new C201589kO(r72));
                    C172878Nf it = r8.iterator();
                    while (it.hasNext()) {
                        A0t2.put(it.next(), r73);
                    }
                    C1903395j r22 = new C1903395j(r73, A0t2);
                    HashMap A0t3 = AnonymousClass001.A0t();
                    A0t3.put(ARAssetType.EFFECT, r5);
                    A0t3.put(ARAssetType.SUPPORT, r22);
                    A0t3.put(ARAssetType.SCRIPTING_PACKAGE, r4);
                    C1903295i r23 = new C1903295i(A0t3);
                    AnonymousClass9MB r1 = new AnonymousClass9MB(r6);
                    C195539Yh r13 = new C195539Yh(r23, r1, r1, r1, r1, r1, r1);
                    C73513fd r15 = new C73513fd((C69423Wy) r0.A0A, new C72233dO("AR Delivery Thread"), 3);
                    r15.allowCoreThreadTimeOut(true);
                    C110925hG r24 = new C110925hG(r0);
                    File A0A = AnonymousClass002.A0A(A01, "tmp_download");
                    C1001959y r142 = new C1001959y();
                    C64333Db r3 = r0.A00.A00.A01;
                    AnonymousClass4FS A8y = C64333Db.A8y(r3);
                    AnonymousClass4Zk r52 = r12;
                    AnonymousClass9TM r42 = new AnonymousClass9TM(r52, r24, new C107185aq(C64333Db.A07(r3), C86654Ky.A0Y(r3), (C55132pq) r3.AU8.get(), A8y, A0A), r0.A06, r142);
                    C104855Sp r132 = r0.A03;
                    AnonymousClass9W5 r92 = new AnonymousClass9W5(r42, r13, r12, r132, r142, r15, r15, r15);
                    C1903395j A02 = r13.A02();
                    C1903595l A022 = A02.A02();
                    C110915hF r32 = r0.A05;
                    AnonymousClass9W5 r18 = r92;
                    AnonymousClass4Zk r222 = r12;
                    AnonymousClass9PU r33 = new AnonymousClass9PU(new AnonymousClass9TF(r18, new AnonymousClass9Yb(A022), new AnonymousClass9Yc(A02), r32, r222, r132), r52, r0.A01, r132, r15);
                    HashMap A0t4 = AnonymousClass001.A0t();
                    A0t4.put("AnimationModule", "6e772e545745209780eef7567aa60f5f1b0b27e2");
                    A0t4.put("AssetsModule", "6beba7a7edfce60ffa5730fe38017703ec6ea1d7");
                    A0t4.put("AudioModule", "dd0ce7ecf2d4c68f8a2df219fdef6e4b6bdc00f6");
                    A0t4.put("AvatarModule", "b39a0804e44118c5acb8cf18fb36b1525399a91b");
                    A0t4.put("BlocksModule", "a8dda34639b414c7ab7723277db169a1e793e920");
                    A0t4.put("CameraInfoModule", "b5c576dff89083574773b9597a8356f3b099c806");
                    A0t4.put("CapabilitiesModule", "fc7347a45837ec9cf5b16524d8b74b4bdad7b7bf");
                    A0t4.put("ComposedMaterialDynamicInstantiation", "dd215d9e2ee0a0768a24b827176c54323fe3dfcc");
                    A0t4.put("CoreModule", "14f3a5d288215ff543b586b1973f919c2d64f32c");
                    A0t4.put("DeviceMotionModule", "3e68f7dc212d7eb732139d3d181c98e04a2b3530");
                    A0t4.put("DiagnosticsModule", "c0591f5fcefd144bf030987c517c57d6975e8dc6");
                    A0t4.put("FaceGesturesModule", "07f7acc884bd79af4dc2d304fb4e8dd610cfe5a3");
                    A0t4.put("FaceSceneModule", "9f44036ae25a630de7f31f2613657849c73f1a29");
                    A0t4.put("FaceTrackingModule", "9992b298cf45f83beb4bc6e5599872d67cb2479c");
                    A0t4.put("FacialActionsModule", "b1ed274717dcdbd986ab68edfafab7b84ff05b8e");
                    A0t4.put("FontsModule", "2b71f8280d41d3bb1696d36c1e135fbe54f57db1");
                    A0t4.put("GalleryTextureModule", "273ab023a2667cb1d8e375397cdd780063b92bff");
                    A0t4.put("InstructionModule", "ae57f28711c6e8c23ba51c4016a6942a27c3e685");
                    A0t4.put("InstructionModuleExtension", "a8df79185606b246c75c88c52b66f72830de9bfd");
                    A0t4.put("IrisTrackingModule", "4d5be20c79f1752b6a60e19d855932e50224c4a7");
                    A0t4.put("LayersModule", "c3178b1e9859e303e29f45191a9860aa4601789e");
                    A0t4.put("MaterialsModule", "0ae896813c2253355ec19670fff75dc40dc602b8");
                    A0t4.put("MaterialsShadersExtension", "abd7db0edd16510328327c9b37e809af371d041c");
                    A0t4.put("NativeUIModule", "299c0bf9bdc10c92e3e9b490c8f9314329c99fd9");
                    A0t4.put("PatchesModule", "647ac4c53598d4f4ccaeaf5dafb36a9de56c5e80");
                    A0t4.put("PlanarTextModule", "71344ee57ed2961278e9aa85952d494f914c35db");
                    A0t4.put("PlatformEventsModule", "da52d84ded0d84fa096933f78027dec1716d18c2");
                    A0t4.put("PrefabsModule", "a617d39bc752fe8fc66e3e9381852f7763e620c8");
                    A0t4.put("RandomModule", "274ba7b18116febeaf5e3353206ff603c4503b07");
                    A0t4.put("ReactiveLogicExtension", "c95348bf6861e2d7ee307c82b5268efc71a11a97");
                    A0t4.put("ReactiveMathExtension", "49bde7d9d318c292b3fa394ec7d7c1af19c95103");
                    A0t4.put("ReactiveModule", "36e46bd410d99fcf372f05974505571744a303f5");
                    A0t4.put("ReactiveUtilExtension", "2fddbec4fcaa578cba97575e5a22c326f7101c31");
                    A0t4.put("RuntimeModule", "467a75e319b66f7da1c905c08f1e909e745435c7");
                    A0t4.put("SceneModule", "721b6338557975642334c74f92ccb82bcb928cc3");
                    A0t4.put("ShadersModule", "5a0e9667775ff2b8bcb6d7a24b0f2a1baeb2a028");
                    A0t4.put("SystraceModule", "8817929726b84ffc5e9e127066d439b1bf832cd8");
                    A0t4.put("TextExtrusionModule", "244dc3bd215590d99c2b48564786f29fad56b6a9");
                    A0t4.put("TexturesModule", "8e56ffbedb9b7e3fba1b7b83f35655face304238");
                    A0t4.put("TimeModule", "72289aee516e1f83bd8d10dbb3cc484b2519f7fe");
                    A0t4.put("TimeModuleExtension", "a6052e9a8f4904bc51cc21f18360bce4adb4fbee");
                    A0t4.put("TouchGesturesModule", "352a0b9e98b1f770b0e2db01a14469fac628b044");
                    A0t4.put("UnitsModule", "e744e8381093bad111dc2d352d6fcca366fc6577");
                    A0t4.put("VisualShadersExtension", "d92e19a0706bde9c4cf161ff9a177251187723d2");
                    A0t4.put("VisualTimeExtension", "f2b5ead5ff6de527007cb9363c81d503c5589c35");
                    A0t4.put("WorkerModule", "2220228ecb88fbdd1b84c21621b59bad02318f0b");
                    A0t4.put("arfx", "dd23079c73b0f098c1c40685b483df6ac83943d9");
                    A0t4.put("arfx_polyfill", "e12262d01285f417d7ede31a47497d1471ab0f67");
                    r0.A0B = new C195639Yw(r18, r33, new C193649Pl(r92, r222, r0.A02, r132, A0t4, r15), r12, r132, r0.A04, new C100675Bv(), r15);
                    r0.A0C = new C105665Vx(r33, r13);
                }
            }
        }
        C195639Yw r02 = r0.A0B;
        C626936e.A06(r02);
        return r02;
    }
}
