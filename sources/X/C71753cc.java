package X;

import android.content.Context;
import android.webkit.URLUtil;
import com.whatsapp.util.Log;
import java.io.File;
import java.net.URL;
import java.util.concurrent.Executor;

/* renamed from: X.3cc  reason: invalid class name and case insensitive filesystem */
public abstract class C71753cc implements Runnable, AnonymousClass4D9, C184458rr {
    public C185088t4 A00;
    public final AnonymousClass3QK A01;

    public final void A04(boolean z) {
        C185088t4 r0;
        synchronized (this) {
            r0 = this.A00;
        }
        if (r0 == null) {
            return;
        }
        if (z) {
            r0.Ayb();
        } else {
            r0.cancel();
        }
    }

    public AnonymousClass4EV A00() {
        int i;
        if (this instanceof C28221fu) {
            i = 2;
        } else if (!(this instanceof AnonymousClass1g2)) {
            return this.A01;
        } else {
            i = 1;
        }
        return new C85904Ib(this, i);
    }

    public C56902sk A01(C625435m r4) {
        if (this instanceof AnonymousClass1g2) {
            C56902sk r2 = new C56902sk();
            AnonymousClass39M r1 = ((AnonymousClass1g2) this).A06;
            r2.A0A(r1.A03);
            r2.A08(r1.A02);
            r2.A0F(AnonymousClass000.A1T(r4.A01));
            r2.A07();
            return r2;
        } else if ((this instanceof AnonymousClass1g0) || (this instanceof C28251fy) || (this instanceof AnonymousClass1g1) || (this instanceof C28241fx) || (this instanceof AnonymousClass1fz)) {
            return new C56902sk();
        } else {
            if (this instanceof C28221fu) {
                C56902sk r22 = new C56902sk();
                AnonymousClass39M r12 = ((C28221fu) this).A02;
                r22.A0A(r12.A03);
                r22.A08(r12.A02);
                r22.A0F(AnonymousClass000.A1T(r4.A01));
                r22.A07();
                return r22;
            }
            C56902sk r13 = new C56902sk();
            r13.A0F(AnonymousClass000.A1T(r4.A01));
            r13.A07();
            return r13;
        }
    }

    public AnonymousClass7E5 A02() {
        AnonymousClass7E5 r3;
        C185088t4 r32;
        boolean z;
        try {
            Object A03 = A03();
            if (this instanceof AnonymousClass1g3) {
                AnonymousClass1g3 r0 = (AnonymousClass1g3) this;
                C156847hJ r1 = (C156847hJ) A03;
                C162457s7.A0J(r1, 0);
                AnonymousClass7L2 r8 = new AnonymousClass7L2(new AnonymousClass3QS(r0.A02, r0.A03, r1.A04), r1.A02, r1.A05);
                C56852sf r7 = r1.A00;
                if (r7 == null) {
                    r7 = new C56852sf(r1.A01, 0);
                }
                C56612sH r5 = r0.A01;
                C56492s4 r4 = r0.A00;
                C29011i8 r10 = r0.A05;
                C55002pd r6 = r0.A04;
                if (r0 instanceof AnonymousClass1fz) {
                    z = true;
                } else {
                    z = false;
                }
                r32 = new C72143dF(r4, r5, r6, r7, r8, this, r10, r1.A03, z);
            } else {
                AnonymousClass1fv r02 = (AnonymousClass1fv) this;
                AnonymousClass7PD r12 = (AnonymousClass7PD) A03;
                C162457s7.A0J(r12, 0);
                C149777Nv r102 = new C149777Nv(new AnonymousClass3QS(r02.A02, r02.A03, r12.A03), r12.A01, r12.A02, r12.A05, r12.A06);
                C56612sH r52 = r02.A01;
                r32 = new AnonymousClass3QR(r02.A00, r52, r02.A04, r102, r12.A00, this, r02.A05);
            }
            synchronized (this) {
                if (this.A00 != null) {
                    Log.e("Attempt to run same download multiple times");
                    r3 = new AnonymousClass7E5(new C625435m(24));
                } else {
                    this.A00 = r32;
                    r3 = r32.B2A();
                }
            }
        } catch (C1000559g e) {
            r3 = new AnonymousClass7E5(new C625435m(e.downloadStatus));
        }
        C625435m r2 = r3.A00;
        int i = r2.A01;
        if (i == 13 || i == 24) {
            this.A01.BRW(r2.A05);
            return r3;
        }
        this.A01.BRX(r2, A01(r2));
        return r3;
    }

    public Object A03() {
        String str;
        String str2;
        C182988pJ r3;
        File file;
        C633138t r0;
        if (this instanceof AnonymousClass1g2) {
            AnonymousClass1g2 r02 = (AnonymousClass1g2) this;
            r3 = new AnonymousClass3UO(r02.A06.A0G);
            file = r02.A0A;
            r0 = C633138t.A0b;
        } else if (this instanceof AnonymousClass1g0) {
            AnonymousClass1g0 r03 = (AnonymousClass1g0) this;
            Log.d("AnonymousProfilePicDownload/createRequest");
            String str3 = r03.A08;
            C32431qO r5 = new C32431qO(r03.A05, C627236i.A04(str3), "ppic", (String) null, str3, (String) null);
            Context context = r03.A04.A00;
            C162457s7.A0D(context);
            File A0A = AnonymousClass002.A0A(AnonymousClass0x7.A0e(context.getCacheDir(), "NewsletterProfilePictureTemp"), URLUtil.guessFileName(AnonymousClass000.A0V("https://pps.whatsapp.net", str3, AnonymousClass001.A0o()), (String) null, (String) null));
            r03.A01 = A0A;
            C633138t r10 = C633138t.A0C;
            C162457s7.A0F(r10);
            return new C156847hJ((C56852sf) null, r10, r5, (C46822cG) null, A0A, false);
        } else if (this instanceof C28251fy) {
            C28251fy r04 = (C28251fy) this;
            Log.d("DocumentPlainFileDownload/create-request");
            r3 = new AnonymousClass8JU(r04.A03, r04.A02);
            file = r04.A01;
            r0 = r04.A00;
        } else if (this instanceof AnonymousClass1g1) {
            AnonymousClass1g1 r05 = (AnonymousClass1g1) this;
            Log.d("ProfilePicturePlainFileDownload/createRequest");
            r05.A0A = true;
            AnonymousClass1VX r52 = r05.A04;
            AnonymousClass2T0 r2 = r05.A05;
            String str4 = r2.A05;
            String str5 = r2.A04;
            C32431qO r4 = new C32431qO(r52, str4, "ppic", (String) null, str5, (String) null);
            Context context2 = r05.A03.A00;
            URL url = r2.A06;
            int i = r2.A02;
            File A002 = C59792xU.A00(context2, str5, url, i);
            r05.A09 = A002;
            C633138t r18 = C633138t.A0C;
            if (i == 1) {
                str2 = "manual";
            } else {
                str2 = "full";
            }
            C162457s7.A0J(r52, 1);
            return new C156847hJ((C56852sf) null, r18, r4, new C46822cG(r52, (Integer) null, "profile_picture", "ppic", str2, false), A002, false);
        } else if (this instanceof C28241fx) {
            C28241fx r06 = (C28241fx) this;
            C50522iJ r42 = new C50522iJ();
            AnonymousClass1I7 r32 = r06.A00;
            C47662dc r22 = r32.A0e;
            r42.A04 = r22.A0F;
            C633138t r53 = r22.A0A;
            if (AnonymousClass36O.A05(r53)) {
                str = r22.A0H;
            } else {
                str = r22.A0G;
            }
            r42.A08 = str;
            r42.A07 = r53.A02;
            return new C156847hJ(r32.A0h, r53, r42.A00(), r32.A0A(), r32.A03, r06.A01);
        } else if (this instanceof AnonymousClass1fz) {
            AnonymousClass1fz r07 = (AnonymousClass1fz) this;
            Log.d("ExpressPathEncryptedFileDownload/create-request");
            AnonymousClass3UO r54 = new AnonymousClass3UO(r07.A04);
            File file2 = r07.A03;
            return new C156847hJ(r07.A00, r07.A01, r54, r07.A02, file2, false);
        } else if (this instanceof C28221fu) {
            C28221fu r08 = (C28221fu) this;
            C56352rq r1 = r08.A00;
            AnonymousClass39M r43 = r08.A02;
            String str6 = r43.A0D;
            File A012 = C64393Dh.A01(C54292oU.A01(r1.A00), "Stickers");
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass0x2.A1M(A0o, str6);
            File A0A2 = C18270x1.A0A(A012, ".tmp", A0o);
            String str7 = r43.A08;
            if (str7 == null) {
                Log.e("StickerBitmapNetworkFetcher/StickerDownload/makeRequest failed to find enc file hash for sticker");
                throw new C1000559g(27);
            } else if (r43.A0B != null) {
                C633138t r55 = C633138t.A0b;
                C50522iJ r23 = new C50522iJ();
                r23.A08 = str7;
                r23.A07 = "sticker";
                r23.A04 = r43.A06;
                return new AnonymousClass7PD(r55, r23.A00(), A0A2, r08.A04, r43.A0B, r43.A0D);
            } else {
                Log.e("StickerBitmapNetworkFetcher/StickerDownload/makeRequest failed to find media key for sticker");
                throw new C1000559g(29);
            }
        } else {
            AnonymousClass1ft r09 = (AnonymousClass1ft) this;
            C633138t r44 = C633138t.A0K;
            C50522iJ r24 = new C50522iJ();
            r24.A08 = r09.A04;
            r24.A07 = "md-app-state";
            r24.A04 = r09.A03;
            C32431qO A003 = r24.A00();
            File file3 = r09.A01;
            C626936e.A06(file3);
            File file4 = r09.A00;
            C626936e.A06(file4);
            return new AnonymousClass7PD(r44, A003, file3, file4, r09.A02, r09.A05);
        }
        return new C156847hJ(r0, r3, file);
    }

    public void AwR(AnonymousClass4EV r6) {
        AnonymousClass3QK r4 = this.A01;
        AnonymousClass3XB r2 = r4.A01;
        C124266Bp r0 = new C124266Bp(r6, 13);
        Executor executor = r4.A03;
        r2.A04(r0, executor);
        r4.A02.A04(new C124266Bp(r6, 14), executor);
        r4.A00.A04(new C86234Ji(r6, 20), executor);
    }

    public void Ayd(boolean z) {
        String str;
        if (this instanceof C28221fu) {
            str = "StickerBitmapNetworkFetcher/StickerDownload/cancelMediaDownload attempted to cancel download";
        } else {
            if (this instanceof AnonymousClass1g2) {
                str = "AvatarStickerBitmapNetworkFetcher/StickerDownload/cancelMediaDownload attempted to cancel download";
            }
            A04(false);
        }
        Log.i(str);
        A04(false);
    }

    public void BRV(long j) {
        this.A01.BRU(j);
    }

    public C71753cc(Executor executor) {
        this.A01 = new AnonymousClass3QK(executor);
    }

    public void BRY(int i) {
        C18260x0.A0w("basefiledownload/progress=", AnonymousClass001.A0o(), i);
    }

    public void run() {
        A02();
    }
}
