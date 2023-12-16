package X;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: X.3ew  reason: invalid class name and case insensitive filesystem */
public class C73103ew implements XmlSerializer {
    public static final String[] A0B = {"&#0;", "&#1;", "&#2;", "&#3;", "&#4;", "&#5;", "&#6;", "&#7;", "&#8;", "&#9;", "&#10;", "&#11;", "&#12;", "&#13;", "&#14;", "&#15;", "&#16;", "&#17;", "&#18;", "&#19;", "&#20;", "&#21;", "&#22;", "&#23;", "&#24;", "&#25;", "&#26;", "&#27;", "&#28;", "&#29;", "&#30;", "&#31;", null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};
    public int A00;
    public int A01;
    public OutputStream A02;
    public Writer A03;
    public ByteBuffer A04;
    public CharsetEncoder A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final char[] A0A;

    public final void A00(char c) {
        int i = this.A01;
        if (i >= this.A09 - 1) {
            flush();
            i = this.A01;
        }
        this.A0A[i] = c;
        this.A01 = i + 1;
    }

    public final void A03(String str, int i, int i2) {
        int i3 = this.A09;
        if (i2 > i3) {
            int i4 = i2 + i;
            while (i < i4) {
                int i5 = i3;
                int i6 = i + i3;
                if (i6 >= i4) {
                    i5 = i4 - i;
                }
                A03(str, i, i5);
                i = i6;
            }
            return;
        }
        int i7 = this.A01;
        if (i7 + i2 > i3) {
            flush();
            i7 = this.A01;
        }
        str.getChars(i, i + i2, this.A0A, i7);
        this.A01 = i7 + i2;
    }

    public final void A04(char[] cArr, int i, int i2) {
        int i3 = this.A09;
        if (i2 > i3) {
            int i4 = i2 + i;
            while (i < i4) {
                int i5 = i3;
                int i6 = i + i3;
                if (i6 >= i4) {
                    i5 = i4 - i;
                }
                A04(cArr, i, i5);
                i = i6;
            }
            return;
        }
        int i7 = this.A01;
        if (i7 + i2 > i3) {
            flush();
            i7 = this.A01;
        }
        System.arraycopy(cArr, i, this.A0A, i7, i2);
        this.A01 = i7 + i2;
    }

    public XmlSerializer attribute(String str, String str2, String str3) {
        A00(' ');
        if (str != null) {
            A01(str);
            A00(':');
        }
        A01(str2);
        A01("=\"");
        A02(str3);
        A00('\"');
        this.A08 = false;
        return this;
    }

    public XmlSerializer endTag(String str, String str2) {
        String str3;
        int i = this.A00 - 1;
        this.A00 = i;
        if (this.A06) {
            str3 = " />\n";
        } else {
            if (this.A07 && this.A08) {
                int i2 = i * 4;
                int length = "                                                              ".length();
                if (i2 > length) {
                    i2 = length;
                }
                A03("                                                              ", 0, i2);
            }
            A01("</");
            if (str != null) {
                A01(str);
                A00(':');
            }
            A01(str2);
            str3 = ">\n";
        }
        A01(str3);
        this.A08 = true;
        this.A06 = false;
        return this;
    }

    public void flush() {
        int i = this.A01;
        if (i > 0) {
            if (this.A02 != null) {
                CharBuffer wrap = CharBuffer.wrap(this.A0A, 0, i);
                CharsetEncoder charsetEncoder = this.A05;
                ByteBuffer byteBuffer = this.A04;
                while (true) {
                    CoderResult encode = charsetEncoder.encode(wrap, byteBuffer, true);
                    if (!encode.isError()) {
                        boolean isOverflow = encode.isOverflow();
                        int position = byteBuffer.position();
                        if (isOverflow) {
                            if (position > 0) {
                                byteBuffer.flip();
                                this.A02.write(byteBuffer.array(), 0, position);
                                byteBuffer.clear();
                            }
                            charsetEncoder = this.A05;
                        } else {
                            if (position > 0) {
                                byteBuffer.flip();
                                this.A02.write(byteBuffer.array(), 0, position);
                                byteBuffer.clear();
                            }
                            this.A02.flush();
                        }
                    } else {
                        throw AnonymousClass002.A0C(encode.toString());
                    }
                }
            } else {
                this.A03.write(this.A0A, 0, i);
                this.A03.flush();
            }
            this.A01 = 0;
        }
    }

    public void setFeature(String str, boolean z) {
        if (str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            this.A07 = true;
            return;
        }
        throw C18320x8.A0m();
    }

    public void setOutput(Writer writer) {
        this.A03 = writer;
    }

    public XmlSerializer startTag(String str, String str2) {
        if (this.A06) {
            A01(">\n");
        }
        if (this.A07) {
            int i = this.A00 * 4;
            int length = "                                                              ".length();
            if (i > length) {
                i = length;
            }
            A03("                                                              ", 0, i);
        }
        this.A00++;
        A00('<');
        if (str != null) {
            A01(str);
            A00(':');
        }
        A01(str2);
        this.A06 = true;
        this.A08 = false;
        return this;
    }

    public XmlSerializer text(char[] cArr, int i, int i2) {
        String str;
        boolean z = false;
        if (this.A06) {
            A01(">");
            this.A06 = false;
        }
        String[] strArr = A0B;
        char length = (char) strArr.length;
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            char c = cArr[i];
            if (c < length && (str = strArr[c]) != null) {
                if (i4 < i) {
                    A04(cArr, i4, i - i4);
                }
                i4 = i + 1;
                A01(str);
            }
            i++;
        }
        if (i4 < i) {
            A04(cArr, i4, i - i4);
        }
        if (this.A07) {
            if (cArr[i3 - 1] == 10) {
                z = true;
            }
            this.A08 = z;
        }
        return this;
    }

    public C73103ew(int i) {
        this.A07 = false;
        this.A00 = 0;
        this.A08 = true;
        i = i <= 0 ? 32768 : i;
        this.A09 = i;
        this.A0A = new char[i];
        this.A04 = ByteBuffer.allocate(i);
    }

    public final void A01(String str) {
        A03(str, 0, str.length());
    }

    public final void A02(String str) {
        String str2;
        int length = str.length();
        String[] strArr = A0B;
        char length2 = (char) strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < length2 && (str2 = strArr[charAt]) != null) {
                if (i2 < i) {
                    A03(str, i2, i - i2);
                }
                i2 = i + 1;
                A01(str2);
            }
            i++;
        }
        if (i2 < i) {
            A03(str, i2, i - i2);
        }
    }

    public void cdsect(String str) {
        throw C18320x8.A0m();
    }

    public void comment(String str) {
        throw C18320x8.A0m();
    }

    public void docdecl(String str) {
        throw C18320x8.A0m();
    }

    public void endDocument() {
        flush();
    }

    public void entityRef(String str) {
        throw C18320x8.A0m();
    }

    public int getDepth() {
        throw C18320x8.A0m();
    }

    public boolean getFeature(String str) {
        throw C18320x8.A0m();
    }

    public String getName() {
        throw C18320x8.A0m();
    }

    public String getNamespace() {
        throw C18320x8.A0m();
    }

    public String getPrefix(String str, boolean z) {
        throw C18320x8.A0m();
    }

    public Object getProperty(String str) {
        throw C18320x8.A0m();
    }

    public void ignorableWhitespace(String str) {
        throw C18320x8.A0m();
    }

    public void processingInstruction(String str) {
        throw C18320x8.A0m();
    }

    public void setPrefix(String str, String str2) {
        throw C18320x8.A0m();
    }

    public void setProperty(String str, Object obj) {
        throw C18320x8.A0m();
    }

    public void startDocument(String str, Boolean bool) {
        String str2;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("<?xml version='1.0' encoding='utf-8' standalone='");
        if (bool.booleanValue()) {
            str2 = "yes";
        } else {
            str2 = "no";
        }
        A0o.append(str2);
        A01(AnonymousClass000.A0X("' ?>\n", A0o));
        this.A08 = true;
    }

    public C73103ew() {
        this(32768);
    }

    public void setOutput(OutputStream outputStream, String str) {
        if (outputStream != null) {
            try {
                CharsetEncoder newEncoder = Charset.forName(str).newEncoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
                this.A05 = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
                this.A02 = outputStream;
            } catch (IllegalCharsetNameException e) {
                throw new UnsupportedEncodingException(str).initCause(e);
            } catch (UnsupportedCharsetException e2) {
                throw new UnsupportedEncodingException(str).initCause(e2);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public XmlSerializer text(String str) {
        boolean z = false;
        if (this.A06) {
            A01(">");
            this.A06 = false;
        }
        A02(str);
        if (this.A07) {
            int length = str.length();
            if (length > 0 && str.charAt(length - 1) == 10) {
                z = true;
            }
            this.A08 = z;
        }
        return this;
    }
}
