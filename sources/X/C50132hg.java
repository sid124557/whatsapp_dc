package X;

import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2hg  reason: invalid class name and case insensitive filesystem */
public class C50132hg {
    public final AnonymousClass2EI A00;
    public final AnonymousClass1VX A01;
    public final C44492Wg A02;
    public final C51852kU A03;
    public final C42442Oc A04;
    public final AnonymousClass4FS A05;
    public final C183538qC A06;

    public void A00(AnonymousClass48J r6, String str) {
        Map map;
        WeakReference weakReference;
        C42442Oc r4 = this.A04;
        synchronized (r4) {
            if (r4.A02 == null) {
                HashMap A0t = AnonymousClass001.A0t();
                r4.A02 = A0t;
                A0t.put("chat_transfer_android_to_android_lottie_animation", new C58472vJ());
                C58472vJ.A00(4890, "avatar_animated_sticker", "avatar_animated_sticker.webp", r4.A02);
            }
            map = r4.A02;
        }
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            AnonymousClass4FS r3 = this.A05;
            C626936e.A06(obj);
            C58472vJ r42 = (C58472vJ) obj;
            if (r6 != null) {
                weakReference = AnonymousClass0x9.A14(r6);
            } else {
                weakReference = null;
            }
            r3.BkP(new AnonymousClass1I6((AnonymousClass2VT) this.A00.A00.A01.A00.A4K.get(), r42, str, weakReference));
        } else if (r6 != null) {
            C89704el r62 = (C89704el) r6;
            Log.d("fpm/ChatTransferActivity/downloaded-lottie-on-demand");
            r62.A04.BkQ(new C70023Zo(r62, 21), "fpm/ChatTransferActivity/lottie");
        }
    }

    public C50132hg(AnonymousClass2EI r1, AnonymousClass1VX r2, C44492Wg r3, C51852kU r4, C42442Oc r5, AnonymousClass4FS r6, C183538qC r7) {
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A05 = r6;
        this.A06 = r7;
        this.A04 = r5;
        this.A02 = r3;
    }

    public final void A01(Map map, boolean z) {
        StringBuilder A0o;
        String str;
        if (map.isEmpty()) {
            Log.d("NetworkResourcesManager/no-files-to-download");
            return;
        }
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            String A0q2 = C18310x6.A0q(A0w);
            C58472vJ r5 = (C58472vJ) A0w.getValue();
            C51852kU r4 = this.A03;
            if (r4.A00(A0q2) != 3) {
                Integer num = r5.A00;
                if (num != null) {
                    if (!this.A01.A0Y(C58422vE.A02, num.intValue())) {
                        A0o = AnonymousClass001.A0o();
                        str = "NetworkResourcesManager/resource ineligible for download/";
                        C18260x0.A0q(str, A0q2, A0o);
                    }
                }
                C18260x0.A0q("NetworkResourcesManager/fetching resource/", A0q2, AnonymousClass001.A0o());
                if (z) {
                    this.A05.BkM(new AnonymousClass1I6((AnonymousClass2VT) this.A00.A00.A01.A00.A4K.get(), r5, A0q2, (WeakReference) null));
                } else {
                    this.A02.A00(r5, A0q2);
                }
                r4.A02(A0q2, 1);
                A0o = AnonymousClass001.A0o();
                str = "NetworkResourcesManager/queued resource/";
                C18260x0.A0q(str, A0q2, A0o);
            }
        }
    }
}
