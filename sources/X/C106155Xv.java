package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.calling.service.VoiceServiceEventCallback;
import com.whatsapp.voipcalling.H26xSupportResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Xv  reason: invalid class name and case insensitive filesystem */
public class C106155Xv {
    public SharedPreferences A00;
    public final AnonymousClass1VX A01;
    public final C60152y5 A02;
    public final C187958y5 A03;

    public final synchronized SharedPreferences A03() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A03("voip_prefs");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public static SharedPreferences.Editor A01(VoiceServiceEventCallback voiceServiceEventCallback) {
        return voiceServiceEventCallback.voiceService.A1l.A03().edit();
    }

    public String A04() {
        String A0Q = this.A01.A0Q(151);
        if (TextUtils.isEmpty(A0Q)) {
            return C18280x3.A0Z(A03(), "camera2_required_hardware_support_level");
        }
        return A0Q;
    }

    public C106155Xv(AnonymousClass1VX r1, C60152y5 r2, C187958y5 r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
    }

    public static SharedPreferences.Editor A00(C106155Xv r0) {
        return r0.A03().edit();
    }

    public static void A02(C107285b3 r3) {
        r3.A0I();
        r3.A38.setRequestedCamera2SupportLevel(r3.A1l.A04(), r3.A1k);
    }

    public List A05() {
        Map<String, ?> all = A03().getAll();
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator A0i = C18280x3.A0i(all);
        while (A0i.hasNext()) {
            String A0m = AnonymousClass001.A0m(A0i);
            if (A0m.startsWith("joinable_")) {
                A0s.add(A0m.substring(9));
            }
        }
        return A0s;
    }

    public void A06(H26xSupportResult h26xSupportResult) {
        C18270x1.A0l(A00(this).putBoolean("video_codec_h264_hw_supported", h26xSupportResult.isH264HwSupported).putBoolean("video_codec_h264_sw_supported", h26xSupportResult.isH264SwSupported).putBoolean("video_codec_h265_hw_supported", h26xSupportResult.isH265HwSupported), "video_codec_h265_sw_supported", h26xSupportResult.isH265SwSupported);
    }

    public void A07(String str) {
        C18270x1.A0g(A00(this), AnonymousClass000.A0V("joinable_", str, AnonymousClass001.A0o()));
    }
}
