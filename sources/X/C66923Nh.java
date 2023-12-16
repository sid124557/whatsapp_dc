package X;

import android.util.Base64;
import com.whatsapp.util.Log;

/* renamed from: X.3Nh  reason: invalid class name and case insensitive filesystem */
public class C66923Nh implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public void AyD(C55032pg r7, C624134x r8) {
        if (r8 instanceof C30511mZ) {
            C30511mZ r82 = (C30511mZ) r8;
            if (r82.A03 == null || r82.A02 == null || r82.A01 == null || r82.A00 <= 0) {
                Log.w("FMessageMediaExpressPathNotify/buildE2EMessage unable to send media express path noitfy message due to missing url or fileHash");
                return;
            }
            AnonymousClass1A4 r4 = r7.A00;
            AnonymousClass1EB r0 = ((AnonymousClass1EU) r4.A00).documentMessage_;
            if (r0 == null) {
                r0 = AnonymousClass1EB.DEFAULT_INSTANCE;
            }
            AnonymousClass19Z r3 = (AnonymousClass19Z) r0.A0H();
            String str = r82.A03;
            AnonymousClass1EB A0M = C18280x3.A0M(r3);
            str.getClass();
            A0M.bitField0_ |= 1;
            A0M.url_ = str;
            long j = r82.A00;
            AnonymousClass1EB r5 = (AnonymousClass1EB) C18320x8.A0C(r3);
            r5.bitField0_ |= 16;
            r5.fileLength_ = j;
            try {
                byte[] decode = Base64.decode(r82.A02, 2);
                C172548Lq A0J = C18300x5.A0J(r3, decode, decode.length);
                AnonymousClass1EB r1 = (AnonymousClass1EB) r3.A00;
                r1.bitField0_ |= 8;
                r1.fileSha256_ = A0J;
                C172548Lq A0H = C18280x3.A0H(r3, Base64.decode(r82.A01, 2));
                AnonymousClass1EB r12 = (AnonymousClass1EB) r3.A00;
                r12.bitField0_ |= 256;
                r12.fileEncSha256_ = A0H;
            } catch (Exception e) {
                C18260x0.A1O(AnonymousClass001.A0o(), "fmessagemediaexpresspathnotify/createdocumentmessagebuilder ex = ", e);
            }
            AnonymousClass1EB r13 = (AnonymousClass1EB) C18320x8.A0C(r3);
            r13.bitField0_ |= 2;
            r13.mimetype_ = "document";
            r4.A0A(r3);
            return;
        }
        throw AnonymousClass001.A0c("FMessageMediaExpressPathNotifyProtobuf/not supported message");
    }

    public C624134x BgW(C55962rC r9) {
        AnonymousClass1EU r2 = r9.A0B;
        if ((r2.bitField0_ & 64) == 0 || !"medianotify".equals(r9.A0J)) {
            return null;
        }
        AnonymousClass1EB r7 = r2.documentMessage_;
        if (r7 == null) {
            r7 = AnonymousClass1EB.DEFAULT_INSTANCE;
        }
        C626936e.A06(r7);
        AnonymousClass2z0 r4 = r9.A0D;
        C30511mZ r3 = new C30511mZ(r4, r9.A05);
        int i = r7.bitField0_;
        if ((i & 1) != 0) {
            r3.A03 = r7.url_;
        }
        if ((i & 16) != 0) {
            r3.A00 = r7.fileLength_;
        }
        if (AnonymousClass000.A1S(i & 8)) {
            byte[] A07 = r7.fileSha256_.A07();
            int length = A07.length;
            if (length != 32) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("FMessageMediaExpessPathNotify/bogus sha-256 hash received; length=");
                A0o.append(length);
                C18260x0.A1S(A0o, "; message.key=", r4);
            } else {
                r3.A02 = C18290x4.A0t(A07);
            }
        }
        if ((r7.bitField0_ & 256) != 0) {
            byte[] A072 = r7.fileEncSha256_.A07();
            int length2 = A072.length;
            if (length2 != 32) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("FMessageMediaExpessPathNotify/bogus sha-256 enc hash received; length=");
                A0o2.append(length2);
                C18260x0.A1Q(A0o2, "; message.key=", r4);
            } else {
                r3.A01 = C18290x4.A0t(A072);
                return r3;
            }
        }
        return r3;
    }
}
