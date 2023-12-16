package X;

import java.util.List;

/* renamed from: X.2iT  reason: invalid class name and case insensitive filesystem */
public class C50612iT {
    public int A00;
    public long A01;
    public long A02;
    public String A03;
    public List A04;
    public List A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final AnonymousClass39M A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;

    public boolean A00() {
        String str;
        String str2 = this.A03;
        if (str2 == null || (str = this.A0H) == null || str2.equals(str)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("StickerPack{");
        stringBuffer.append("id='");
        stringBuffer.append(this.A0G);
        stringBuffer.append('\'');
        stringBuffer.append(", name='");
        stringBuffer.append(this.A0I);
        stringBuffer.append('\'');
        stringBuffer.append(", publisher='");
        stringBuffer.append(this.A0K);
        stringBuffer.append('\'');
        stringBuffer.append(", description='");
        stringBuffer.append(this.A0A);
        stringBuffer.append('\'');
        stringBuffer.append(", size=");
        stringBuffer.append(this.A02);
        stringBuffer.append(", isDownloading=");
        stringBuffer.append(this.A06);
        stringBuffer.append(", trayImageId='");
        stringBuffer.append(this.A0M);
        stringBuffer.append('\'');
        stringBuffer.append(", trayImagePreviewId='");
        stringBuffer.append(this.A0N);
        stringBuffer.append('\'');
        stringBuffer.append(", previewImageIds=");
        stringBuffer.append(this.A04);
        stringBuffer.append(", stickers=");
        stringBuffer.append(this.A05);
        stringBuffer.append(", order=");
        stringBuffer.append(this.A00);
        stringBuffer.append(", isThirdParty=");
        stringBuffer.append(this.A0T);
        stringBuffer.append(", imageDataHash='");
        stringBuffer.append(this.A0H);
        stringBuffer.append('\'');
        stringBuffer.append(", downloadedSize=");
        stringBuffer.append(this.A01);
        stringBuffer.append(", downloadedImageDataHash='");
        stringBuffer.append(this.A03);
        stringBuffer.append('\'');
        stringBuffer.append(", downloadedTrayImageId='");
        stringBuffer.append(this.A0B);
        stringBuffer.append('\'');
        stringBuffer.append(", downloadedTrayImagePreviewId='");
        stringBuffer.append(this.A0C);
        stringBuffer.append('\'');
        stringBuffer.append(", isUnseen=");
        stringBuffer.append(this.A08);
        stringBuffer.append(", isNew=");
        stringBuffer.append(this.A07);
        stringBuffer.append(", avoidCaching=");
        stringBuffer.append(this.A0P);
        stringBuffer.append(", playLink='");
        stringBuffer.append(this.A0J);
        stringBuffer.append('\'');
        stringBuffer.append(", iOSLink='");
        stringBuffer.append(this.A0F);
        stringBuffer.append('\'');
        stringBuffer.append(", animatedPack=");
        stringBuffer.append(this.A0O);
        stringBuffer.append(", downloadedAnimatedPack=");
        stringBuffer.append(this.A0Q);
        stringBuffer.append(", isAvatarStickerPack=");
        stringBuffer.append(this.A0S);
        stringBuffer.append(", trayIconAvatarStickerTemplateId=");
        stringBuffer.append(this.A0L);
        stringBuffer.append(", emptyFavoritesAvatarStickerTemplateId=");
        stringBuffer.append(this.A0D);
        stringBuffer.append(", emptyRecentsAvatarStickerTemplateId=");
        stringBuffer.append(this.A0E);
        stringBuffer.append(", avatarStickerPackDynamicIcon=");
        stringBuffer.append(this.A09);
        stringBuffer.append(", lottieStickerPack=");
        stringBuffer.append(this.A0U);
        stringBuffer.append(", downloadedLottieStickerPack=");
        stringBuffer.append(this.A0R);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public C50612iT(C47652db r3) {
        String str = r3.A0E;
        C626936e.A06(str);
        this.A0G = str;
        String str2 = r3.A0G;
        C626936e.A06(str2);
        this.A0I = str2;
        String str3 = r3.A0I;
        C626936e.A06(str3);
        this.A0K = str3;
        this.A0A = r3.A03;
        this.A02 = r3.A01;
        this.A06 = r3.A0T;
        this.A0M = r3.A0K;
        this.A0N = r3.A0L;
        List list = r3.A0M;
        C626936e.A06(list);
        this.A04 = list;
        this.A0T = r3.A0V;
        List list2 = r3.A0N;
        C626936e.A06(list2);
        this.A05 = list2;
        this.A0H = r3.A0F;
        this.A01 = r3.A00;
        this.A03 = r3.A06;
        this.A0B = r3.A09;
        this.A0C = r3.A0A;
        this.A0P = r3.A0P;
        this.A0J = r3.A0H;
        this.A0F = r3.A0D;
        this.A0O = r3.A0O;
        this.A0U = r3.A0U;
        this.A0R = r3.A0S;
        this.A0Q = r3.A0Q;
        this.A0S = r3.A0R;
        this.A0L = r3.A0J;
        this.A0D = r3.A0B;
        this.A0E = r3.A0C;
        this.A09 = r3.A02;
    }
}
