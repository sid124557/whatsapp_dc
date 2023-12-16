package X;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.44M  reason: invalid class name */
public final class AnonymousClass44M extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ boolean $invalidateFileCache = true;
    public final /* synthetic */ AnonymousClass4GQ $onError;
    public final /* synthetic */ AnonymousClass4GQ $onSuccess;
    public final /* synthetic */ int $qplInstanceKey;
    public final /* synthetic */ C47072cf this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass44M(C47072cf r2, AnonymousClass4GQ r3, AnonymousClass4GQ r4, int i) {
        super(1);
        this.this$0 = r2;
        this.$qplInstanceKey = i;
        this.$onSuccess = r3;
        this.$onError = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C69263Wi r5;
        Runnable A00;
        int i;
        C631538d r15 = (C631538d) obj;
        C162457s7.A0J(r15, 0);
        this.this$0.A03.A01(this.$qplInstanceKey, "received_pose_entity");
        C47072cf r52 = this.this$0;
        boolean z = this.$invalidateFileCache;
        int i2 = this.$qplInstanceKey;
        AnonymousClass4GQ r4 = this.$onSuccess;
        AnonymousClass4GQ r3 = this.$onError;
        List<C632138j> list = r15.A00;
        if (list == null) {
            r5 = r52.A00;
            i = 2;
        } else {
            C51932kc r12 = r52.A02;
            JSONArray A1F = AnonymousClass0x9.A1F();
            for (C632138j r11 : list) {
                JSONObject A1G = AnonymousClass0x9.A1G();
                A1G.put("url", r11.A01);
                String str = r11.A00;
                if (str != null) {
                    A1G.put("emojis", str);
                }
                A1F.put(A1G);
            }
            C18270x1.A0e(C18270x1.A04(r12.A01), A1F, "pref_avatar_profile_photo_poses");
            List A002 = r52.A00(list, z, false);
            r52.A03.A01(i2, "poses_downloaded");
            boolean isEmpty = A002.isEmpty();
            r5 = r52.A00;
            if (isEmpty) {
                i = 3;
            } else {
                A00 = C70133a0.A00(r4, A002, 12);
                r5.A0S(A00);
                return C59022wD.A00;
            }
        }
        A00 = new C71273bq((Object) r3, i);
        r5.A0S(A00);
        return C59022wD.A00;
    }
}
