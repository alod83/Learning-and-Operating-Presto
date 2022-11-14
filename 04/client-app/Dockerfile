FROM python:3.8.6

WORKDIR /app

COPY app .

RUN pip install --upgrade pip
RUN pip install presto-python-client
RUN pip install streamlit altair pandas

EXPOSE 8501

CMD ["./run.sh"]