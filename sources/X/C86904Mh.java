package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.pdf.PrintedPdfDocument;
import android.widget.TextView;
import com.whatsapp.R;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.4Mh  reason: invalid class name and case insensitive filesystem */
public class C86904Mh extends PrintDocumentAdapter {
    public Context A00;
    public PrintedPdfDocument A01;
    public final C150907Sr A02;
    public final AnonymousClass5Y0 A03;
    public final String A04 = "join_whatsapp_group.pdf";
    public final String A05;

    public C86904Mh(Context context, C150907Sr r3, AnonymousClass5Y0 r4, String str) {
        this.A00 = context;
        this.A03 = r4;
        this.A05 = str;
        this.A02 = r3;
    }

    public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
        this.A01 = new PrintedPdfDocument(this.A00, printAttributes2);
        if (cancellationSignal.isCanceled()) {
            layoutResultCallback.onLayoutCancelled();
        } else {
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.A04).setContentType(0).setPageCount(1).build(), true);
        }
    }

    public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        PdfDocument.Page startPage = this.A01.startPage(0);
        Canvas canvas = startPage.getCanvas();
        Context context = this.A00;
        TextView textView = new TextView(context);
        textView.setTextColor(-16777216);
        textView.setTextSize(0, (float) (canvas.getWidth() / 25));
        textView.setGravity(1);
        textView.setText(C107345b9.A03(context, textView.getPaint(), this.A03, this.A05));
        int width = canvas.getWidth() / 8;
        AnonymousClass001.A19(textView, canvas.getHeight(), Integer.MIN_VALUE, C86664Kz.A05(canvas.getWidth() - (width * 2)));
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        canvas.translate((float) width, (float) (width / 2));
        textView.draw(canvas);
        int i = -width;
        canvas.translate((float) i, (float) (i / 2));
        C150907Sr r6 = this.A02;
        int i2 = r6.A01;
        int i3 = r6.A00;
        int min = Math.min(canvas.getWidth(), AnonymousClass4L0.A05(textView, canvas.getHeight()));
        int i4 = min / 8;
        int i5 = min - (i4 * 2);
        float f = (((float) i5) * 1.0f) / ((float) i2);
        canvas.translate((float) i4, (float) AnonymousClass4L0.A04(textView, i4));
        Paint A0Z = C86664Kz.A0Z();
        A0Z.setColor(-16777216);
        int i6 = 0;
        while (true) {
            if (i6 >= i2) {
                int i7 = (i5 * 4) / 15;
                int i8 = (i5 - i7) / 2;
                int i9 = i7 + i8;
                canvas.drawBitmap(BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_qr_walogo), (Rect) null, new Rect(i8, i8, i9, i9), (Paint) null);
                this.A01.finishPage(startPage);
                PrintDocumentAdapter.WriteResultCallback writeResultCallback2 = writeResultCallback;
                try {
                    this.A01.writeTo(new FileOutputStream(parcelFileDescriptor.getFileDescriptor()));
                    this.A01.close();
                    this.A01 = null;
                    writeResultCallback2.onWriteFinished(new PageRange[]{new PageRange(0, 0)});
                    return;
                } catch (IOException e) {
                    writeResultCallback2.onWriteFailed(e.toString());
                    this.A01.close();
                    this.A01 = null;
                    return;
                } catch (Throwable th) {
                    this.A01.close();
                    this.A01 = null;
                    throw th;
                }
            } else {
                for (int i10 = 0; i10 < i3; i10++) {
                    if (r6.A02[i10][i6] == 1) {
                        canvas.drawRect(f * ((float) i6), f * ((float) i10), f * ((float) (i6 + 1)), f * ((float) (i10 + 1)), A0Z);
                    }
                }
                i6++;
            }
        }
    }
}
