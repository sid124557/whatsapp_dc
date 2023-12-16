package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.community.JoinGroupBottomSheetFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.List;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.5oP  reason: invalid class name and case insensitive filesystem */
public final class C115275oP implements AnonymousClass4EZ {
    public final /* synthetic */ C89654ea A00;
    public final /* synthetic */ C102815Kj A01;
    public final /* synthetic */ C35721xK A02;

    public void BdM(AnonymousClass36K r24, String str) {
        AnonymousClass36K r4 = r24;
        C162457s7.A0J(r4, 1);
        C35721xK r3 = this.A02;
        AnonymousClass36K.A0N(r4, "iq");
        AnonymousClass36K r11 = r3.A00;
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_TYPE};
        Class<String> cls = String.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        C626836d.A06(r4, cls, A0R, A0S, "result", strArr, false);
        Class<Jid> cls2 = Jid.class;
        Long l = A0R;
        Long l2 = A0S;
        AnonymousClass36K r16 = r4;
        Class<Jid> cls3 = cls2;
        Long l3 = A0R;
        Long l4 = A0S;
        C626836d.A06(r16, cls3, l3, l4, C626836d.A06(r11, cls2, l, l2, (Object) null, new String[]{"to"}, false), new String[]{"from"}, true);
        C626836d.A06(r4, cls, A0R, A0S, C626836d.A06(r11, cls, l, l2, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, true);
        List A0B = C626836d.A0B(r4, new C1896292a(MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT), new String[]{"pre_reg_add_requests", "add_request"}, 0, 1024);
        if (C18310x6.A1X(A0B)) {
            C73753g1.A0a(A0B, new AnonymousClass91R(AnonymousClass8ZV.A00, 15));
            C89654ea r2 = this.A00;
            if (!C621433s.A03(r2)) {
                C08270df supportFragmentManager = r2.getSupportFragmentManager();
                String str2 = ((C34801vq) ((C138746qv) ((C138626qj) A0B.get(0)).A00).A01).A00;
                Number number = (Number) ((C138746qv) ((C138626qj) A0B.get(0)).A00).A02;
                C162457s7.A0D(number);
                AnonymousClass344.A01(JoinGroupBottomSheetFragment.A01((C27991fJ) ((C138746qv) ((C138626qj) A0B.get(0)).A00).A03, (UserJid) ((C138626qj) ((C138746qv) ((C138626qj) A0B.get(0)).A00).A00).A00, str2, number.longValue()), supportFragmentManager);
            }
        }
    }

    public C115275oP(C89654ea r1, C102815Kj r2, C35721xK r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BQs(String str) {
        this.A01.A00 = false;
    }

    public void BSN(AnonymousClass36K r1, String str) {
    }
}
