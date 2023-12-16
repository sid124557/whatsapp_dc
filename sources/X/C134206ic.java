package X;

import com.whatsapp.Mp4Ops;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6ic  reason: invalid class name and case insensitive filesystem */
public final class C134206ic extends AnonymousClass3ZG {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A06);
        r3.Blb(2, this.A07);
        r3.Blb(3, this.A08);
        r3.Blb(4, this.A00);
        r3.Blb(5, this.A09);
        r3.Blb(6, this.A01);
        r3.Blb(8, this.A0A);
        r3.Blb(9, this.A0B);
        r3.Blb(10, this.A0C);
        r3.Blb(11, this.A02);
        r3.Blb(12, this.A03);
        r3.Blb(13, this.A0D);
        r3.Blb(14, this.A0E);
        r3.Blb(15, this.A04);
        r3.Blb(16, this.A0F);
        r3.Blb(17, this.A0G);
        r3.Blb(18, this.A0H);
        r3.Blb(19, this.A0I);
        r3.Blb(20, this.A0J);
        r3.Blb(21, this.A0K);
        r3.Blb(22, this.A0L);
        r3.Blb(23, this.A05);
        r3.Blb(24, this.A0M);
    }

    public C134206ic() {
        super(4646, new AnonymousClass5ZC(1, 20, 1000, false), 2, 113760892);
    }

    public static void A00(Mp4Ops.AudioStreamInfo audioStreamInfo, C134206ic r3) {
        r3.A06 = Long.valueOf((long) audioStreamInfo.averageBitrateKbps);
        r3.A07 = Long.valueOf((long) audioStreamInfo.numChannels);
        r3.A08 = Long.valueOf((long) audioStreamInfo.samplingRate);
        r3.A00 = Integer.valueOf(audioStreamInfo.subType);
    }

    public static void A01(C134206ic r4) {
        Long l = r4.A0E;
        if (l != null) {
            r4.A0E = Long.valueOf(System.nanoTime() - l.longValue());
        }
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(C18270x1.A0I(C18270x1.A0H(C18270x1.A0G(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), this.A06, A0r), this.A07, A0r), this.A08, A0r), this.A00, A0r), this.A09, A0r), this.A01);
        AnonymousClass3ZG.A0I(A0r, 7);
        A0r.put(C86634Kw.A0u(C86634Kw.A0t(AnonymousClass6C8.A0a(AnonymousClass0x2.A0Q(AnonymousClass0x2.A0P(AnonymousClass0x2.A0O(AnonymousClass0x2.A0N(C18270x1.A0Q(C18270x1.A0P(C18270x1.A0O(C18270x1.A0N(C18270x1.A0M(C18270x1.A0L(8, this.A0A, A0r), this.A0B, A0r), this.A0C, A0r), this.A02, A0r), this.A03, A0r), this.A0D, A0r), this.A0E, A0r), this.A04, A0r), this.A0F, A0r), this.A0G, A0r), this.A0H, A0r), this.A0I, A0r), this.A0J, A0r), this.A0K);
        A0r.put(22, this.A0L);
        A0r.put(23, this.A05);
        A0r.put(24, this.A0M);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamWamediaMp4opsEvent {");
        C57292tP.A00(A0o, "wamediaMp4opsAudioStreamAverageBitrateKbps", this.A06);
        C57292tP.A00(A0o, "wamediaMp4opsAudioStreamNumChannels", this.A07);
        C57292tP.A00(A0o, "wamediaMp4opsAudioStreamSamplingRate", this.A08);
        C57292tP.A00(A0o, "wamediaMp4opsAudioStreamSubtype", C18270x1.A0T(this.A00));
        C57292tP.A00(A0o, "wamediaMp4opsAudioStreamTrackId", this.A09);
        C57292tP.A00(A0o, "wamediaMp4opsAudioStreamType", C18270x1.A0T(this.A01));
        C57292tP.A00(A0o, "wamediaMp4opsErrorTolerance", this.A0A);
        C57292tP.A00(A0o, "wamediaMp4opsFileSize", this.A0B);
        C57292tP.A00(A0o, "wamediaMp4opsFileSizeOut", this.A0C);
        C57292tP.A00(A0o, "wamediaMp4opsFileType", C18270x1.A0T(this.A02));
        C57292tP.A00(A0o, "wamediaMp4opsImpl", C18270x1.A0T(this.A03));
        C57292tP.A00(A0o, "wamediaMp4opsReturnValue", this.A0D);
        C57292tP.A00(A0o, "wamediaMp4opsTimeElapsedNs", this.A0E);
        C57292tP.A00(A0o, "wamediaMp4opsType", C18270x1.A0T(this.A04));
        C57292tP.A00(A0o, "wamediaMp4opsVideoStreamAverageBitrateKpbs", this.A0F);
        C57292tP.A00(A0o, "wamediaMp4opsVideoStreamFramePerKseconds", this.A0G);
        C57292tP.A00(A0o, "wamediaMp4opsVideoStreamHeight", this.A0H);
        C57292tP.A00(A0o, "wamediaMp4opsVideoStreamLevelIdc", this.A0I);
        C57292tP.A00(A0o, "wamediaMp4opsVideoStreamProfileIdc", this.A0J);
        C57292tP.A00(A0o, "wamediaMp4opsVideoStreamRotation", this.A0K);
        C57292tP.A00(A0o, "wamediaMp4opsVideoStreamTrackId", this.A0L);
        C57292tP.A00(A0o, "wamediaMp4opsVideoStreamType", C18270x1.A0T(this.A05));
        return AnonymousClass3ZG.A0G(this.A0M, "wamediaMp4opsVideoStreamWidth", A0o);
    }
}
