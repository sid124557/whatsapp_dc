package X;

import android.net.Uri;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;

/* renamed from: X.6K0  reason: invalid class name */
public final class AnonymousClass6K0 extends AnonymousClass81W {
    public long A00 = -9223372036854775807L;
    public boolean A01;
    public final Uri A02;
    public final C180178kc A03;
    public final C180218kg A04;

    public C187418xB B0v(AnonymousClass7Z2 r14, AnonymousClass7ZV r15, long j) {
        C185218tH[] r12;
        AnonymousClass816 r0;
        C185218tH[] r122;
        C185218tH r02;
        Uri uri = this.A02;
        C185788uF B0X = this.A04.B0X();
        C1893991d r6 = (C1893991d) this.A03;
        if (r6.A02 != 0) {
            if (C141076uz.AUDIO_ONLY.mValue == ((C152777a6) r6.A01).A01) {
                r12 = new C185218tH[3];
                r12[0] = new AnonymousClass810();
                r12[1] = new AnonymousClass816();
                r02 = new AnonymousClass811();
            } else if (((C157767iq) r6.A00).A0B.shouldAddDefaultMP4Extractor) {
                r12 = new C185218tH[3];
                r12[0] = new AnonymousClass816();
                r12[1] = new AnonymousClass811();
                r02 = new AnonymousClass810();
            } else {
                r12 = new C185218tH[]{new AnonymousClass816()};
            }
            r12[2] = r02;
        } else {
            try {
                Constructor<?> constructor = Class.forName("com.facebook.android.exoplayer2.extractor.mp3.Mp3Extractor").getConstructor(new Class[0]);
                if (((C157767iq) r6.A00).A0B.enableMp3Mp4ExtractorLogic) {
                    C166577yv r1 = ((C152777a6) r6.A01).A0F;
                    Uri uri2 = r1.A05;
                    if (uri2 == null || uri2.getLastPathSegment() == null || !r1.A05.getLastPathSegment().endsWith(".mp3")) {
                        r122 = new C185218tH[2];
                        r122[0] = (C185218tH) constructor.newInstance(new Object[0]);
                        r0 = new AnonymousClass816();
                    } else {
                        r12 = new C185218tH[]{(C185218tH) constructor.newInstance(new Object[0])};
                    }
                } else {
                    String str = ((C152777a6) r6.A01).A0F.A0G;
                    if (str == null || !str.equals("undefined")) {
                        r12 = new C185218tH[]{(C185218tH) constructor.newInstance(new Object[0])};
                    } else {
                        r122 = new C185218tH[2];
                        r122[0] = (C185218tH) constructor.newInstance(new Object[0]);
                        r0 = new AnonymousClass816();
                    }
                }
                r12[1] = r0;
            } catch (Exception e) {
                Log.e("HeroExo2VodInitHelper", "Error while creating Mp3/Mp4 Extractor(s)", e);
                throw C18330xA.A09(e);
            }
        }
        return new AnonymousClass812(uri, this, new C160767oH(r14, this.A03.A02, 0), B0X, r15, r12);
    }

    public void A00() {
    }

    public void A01(C153737br r6, boolean z) {
        long j = this.A00;
        this.A00 = j;
        this.A01 = false;
        A02(new C125706Jb(j, false), (Object) null);
    }

    public void BL3() {
    }

    public void Biu(C187418xB r5) {
        AnonymousClass812 r52 = (AnonymousClass812) r5;
        if (r52.A0F) {
            for (AnonymousClass818 A022 : r52.A0K) {
                A022.A02();
            }
        }
        C157457iK r2 = r52.A0W;
        AnonymousClass6E2 r1 = r2.A00;
        if (r1 != null) {
            r1.A00(true);
        }
        ExecutorService executorService = r2.A02;
        executorService.execute(new C172668Mf(r52, 3));
        executorService.shutdown();
        r52.A0Q.removeCallbacksAndMessages((Object) null);
        r52.A08 = null;
        r52.A0G = true;
        r52.A0T.A03();
    }

    @Deprecated
    public AnonymousClass6K0(Uri uri, C180178kc r4, C180218kg r5) {
        this.A02 = uri;
        this.A04 = r5;
        this.A03 = r4;
    }

    public void A03(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.A00;
        }
        if (this.A00 != j || this.A01 != z) {
            this.A00 = j;
            this.A01 = z;
            A02(new C125706Jb(j, z), (Object) null);
        }
    }
}
