package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.6tZ  reason: invalid class name and case insensitive filesystem */
public final class C140336tZ extends FilterInputStream {
    public int A00;
    public boolean A01;

    public synchronized void mark(int i) {
        throw C18320x8.A0m();
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int read = read();
            if (read != -1) {
                i3 = AnonymousClass6CA.A0D(bArr, read, i + i3, i3);
            } else if (i3 <= 0) {
                return -1;
            } else {
                return i3;
            }
        }
        return i2;
    }

    public synchronized void reset() {
        throw C18320x8.A0m();
    }

    public int available() {
        return 0;
    }

    public boolean markSupported() {
        return false;
    }

    public long skip(long j) {
        for (long j2 = 0; j2 < j; j2++) {
            if (read() == -1) {
                return j2;
            }
        }
        return j;
    }

    public C140336tZ(InputStream inputStream) {
        super(inputStream);
        if (inputStream == null) {
            throw AnonymousClass001.A0g("in may not be null");
        }
    }

    public int read() {
        ByteBuffer allocate = ByteBuffer.allocate(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        byte[] array = allocate.array();
        while (true) {
            int read = super.read();
            if (read == -1) {
                break;
            }
            if (this.A01) {
                int i = this.A00;
                if (i > 0) {
                    this.A00 = i - 1;
                    return read;
                } else if (allocate.remaining() != 0) {
                    allocate.put((byte) read);
                    if (allocate.position() >= 2 && array[allocate.position() - 1] == 10 && array[allocate.position() - 2] == 13) {
                        if (allocate.position() > 2) {
                            String str = new String(array, 0, allocate.position() - 2, C58152un.A0B);
                            try {
                                int parseInt = Integer.parseInt(str, 16);
                                this.A00 = parseInt;
                                if (parseInt == 0) {
                                    if (super.read() == -1) {
                                        throw AnonymousClass002.A0C("stream ended early during parse final chunk");
                                    } else if (super.read() == -1) {
                                        throw AnonymousClass002.A0C("stream ended early during parse final chunk");
                                    }
                                }
                            } catch (NumberFormatException unused) {
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append("chunk length ");
                                A0o.append(str);
                                throw AnonymousClass002.A0C(AnonymousClass000.A0X(" failed to parse", A0o));
                            }
                        }
                    }
                } else {
                    throw AnonymousClass002.A0C("corrupt pseudo http input [max chunk header length exceeded]");
                }
            } else if (allocate.remaining() != 0) {
                allocate.put((byte) read);
                if (allocate.position() >= 2 && array[allocate.position() - 1] == 10 && array[allocate.position() - 2] == 13) {
                    if (allocate.position() == 2) {
                        this.A01 = true;
                    } else {
                        String[] split = new String(array, 0, allocate.position() - 2, C58152un.A0B).split(":", 2);
                        if (split.length == 2) {
                            String trim = split[0].trim();
                            String trim2 = split[1].trim();
                            if (trim.equalsIgnoreCase("Transfer-Encoding") && !trim2.equalsIgnoreCase("chunked")) {
                                throw AnonymousClass002.A0C(AnonymousClass000.A0V("Unexpect transfer encoding encountered: ", trim2, AnonymousClass001.A0o()));
                            }
                        }
                    }
                }
            } else {
                throw AnonymousClass002.A0C("corrupt pseudo http input [max http header length exceeded]");
            }
            allocate.clear();
        }
        return -1;
    }
}
