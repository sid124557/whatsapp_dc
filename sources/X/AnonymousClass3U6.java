package X;

import com.whatsapp.util.Log;
import java.util.Collection;

/* renamed from: X.3U6  reason: invalid class name */
public class AnonymousClass3U6 implements AnonymousClass4FX {
    public void Axd() {
        Log.e("QPL: backgroundListenerEventsFull");
    }

    public void BKs() {
        Log.e("QPL: maxFileCountReached");
    }

    public void BrL() {
        Log.e("QPL: unfinishedListenerEventRemaining");
    }

    public static void A00(String str, String str2, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        sb.append(" (");
        sb.append(str2);
    }

    public void Ax2(int i, String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A00("QPL: annotationKeyTooLong for marker: ", str, A0o, i);
        C18260x0.A1K(A0o, ")");
    }

    public void Ax3(int i, String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("QPL: annotationMisuse ");
        A0o.append(i);
        C18260x0.A0r(" : ", str, A0o);
    }

    public void Ax4(int i, String str, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A00("QPL: annotationSizeLimitExceeded for marker: ", str, A0o, i);
        A0o.append(": ");
        A0o.append(i2);
        C18260x0.A1K(A0o, ")");
    }

    public void B2d(String str) {
        C18260x0.A0r("QPL: errorCompressingFile: ", str, AnonymousClass001.A0o());
    }

    public void B2e(String str) {
        C18260x0.A0r("QPL: errorDeletingFile: ", str, AnonymousClass001.A0o());
    }

    public void B2f(String str) {
        C18260x0.A0r("QPL: errorParsingConfig: ", str, AnonymousClass001.A0o());
    }

    public void B2g(String str) {
        C18260x0.A0r("QPL: errorUploadingFile: ", str, AnonymousClass001.A0o());
    }

    public void B2h(String str) {
        C18260x0.A0r("QPL: errorWritingToFile: ", str, AnonymousClass001.A0o());
    }

    public void B2n(int i) {
        C18260x0.A0x("QPL: eventBuilderRepeatedSubmit ", AnonymousClass001.A0o(), i);
    }

    public void BFj(int i, String str, double d) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A00("QPL: illegalDoubleAnnotation for marker: ", str, A0o, i);
        A0o.append(": ");
        A0o.append(d);
        C18260x0.A1K(A0o, ")");
    }

    public void BJT(int i, String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("QPL: jsonFormatError for marker: ");
        A0o.append(i);
        C18260x0.A0r(" msg: ", str, A0o);
    }

    public void BKu(int i) {
        C18260x0.A0x("QPL: maxMarkerCountExceeded for marker: ", AnonymousClass001.A0o(), i);
    }

    public void BKv(int i) {
        C18260x0.A0x("QPL: maxPointCountExceeded for marker: ", AnonymousClass001.A0o(), i);
    }

    public void BLa(int i) {
        C18260x0.A0x("QPL: noPointName ", AnonymousClass001.A0o(), i);
    }

    public void Bgv(int i, String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A00("QPL: pointDataTooLong for marker: ", str, A0o, i);
        C18260x0.A1K(A0o, ")");
    }

    public void Bgw(int i, String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A00("QPL: pointNameTooLong for marker: ", str, A0o, i);
        C18260x0.A1K(A0o, ")");
    }

    public void Bgx(int i, String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("QPL: pointToEndAtNotFound for marker: ");
        A0o.append(i);
        C18260x0.A0r(" and pointName: ", str, A0o);
    }

    public void Bji(String str) {
        C18260x0.A0r("QPL: reportWarning ", str, AnonymousClass001.A0o());
    }

    public void Bqy(Collection collection) {
        C18260x0.A1Q(AnonymousClass001.A0o(), "QPL: tooManyOpenMarkersToWrite: ", collection);
    }
}
